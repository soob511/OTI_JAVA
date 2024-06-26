package day17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class URLTest12 {

	public static void main(String[] args) {
		try {
			URL req = new URL("file:///iotest/test.json");//URL 객체생성 file:로시작하면 local에서 시작 ///세개 줘야함 file로주면 운영체제 무관하게 줄수 있음
			InputStream is = req.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer bf = new StringBuffer();//문자열 편집과 관련된 객체생성
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				bf.append(line);
			}			
			JSONObject obj = new JSONObject(bf.toString());//json객체 만들때 sf형 안받음 스트링으로 변환
			System.out.println(obj.toString());
			System.out.println(obj.getString("kind"));
			//System.out.println(obj.getString("KIND"));
			System.out.println(obj.getString("name"));
			System.out.println(obj.getInt("age"));	
			System.out.println(obj.getDouble("score"));	
			JSONObject obj2 = obj.getJSONObject("company");
			System.out.println(obj2.getString("name"));
			System.out.println(obj2.getString("initiator"));
			System.out.println(obj2.getBoolean("root"));
			JSONArray friends = obj2.getJSONArray("friends");
			for(Object e : friends)
				System.out.println("- " +e);
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
}
