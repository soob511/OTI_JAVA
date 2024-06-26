package day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class URLBookListLab {

	public static void main(String[] args) {
		try {
			URL req = new URL("http://openapi.seoul.go.kr:8088/796143536a756e69313134667752417a/json/SeoulLibraryBookRentNumInfo/1/100/");
										
			InputStream is = req.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer bf = new StringBuffer();
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				bf.append(line);
			}
			JSONObject obj = new JSONObject(bf.toString());
			
			JSONObject book = obj.getJSONObject("SeoulLibraryBookRentNumInfo");
			JSONArray row = book.getJSONArray("row");
			
			System.out.println("[서울도서관 인기대출 도서목록 100권]");
			System.out.println();
			for (Object e : row) {
				System.out.println(((JSONObject) e).getString("TITLE"));
				System.out.printf("\t%s\n",((JSONObject) e).getString("AUTHOR"));
				System.out.printf("\t%s\n",((JSONObject) e).getString("PUBLISHER"));
			}
		
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
}

