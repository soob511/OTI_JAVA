package day13.실습19;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class HashMapLab1 {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> hash = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		while (count < 5) {
			System.out.println("나라이름을 입력하세요 : ");
			String name = br.readLine();
			System.out.println("인구 수를 입력하세요: ");
			Integer n = Integer.parseInt(br.readLine());
			if (hash.containsKey(name)) {
				System.out.println("나라명 "+ name + "은 이미 저장되었습니다.");
			}else {
				System.out.println("저장되었습니다.");
				hash.put(name, n);
				count++;
			}
		}
		System.out.println("5개가 모두 입력되었습니다.");
		System.out.print("입력된 데이터 :");
//		Iterator<Entry<String, Integer>> iterator = hash.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Entry<String, Integer> entry = iterator.next();
//            System.out.print(String.format("%s(%d)", entry.getKey(),entry.getValue()));
//            if(iterator.hasNext()) {
//            	System.out.print(",");
//            }
//        }
//        
        Iterator<String> iterator = hash.keySet().iterator();
        while(iterator.hasNext()) {
        	String next = iterator.next();
        	System.out.print(iterator.hasNext() ? String.format("%s(%d),", next,hash.get(next)):String.format("%s(%d)",next,hash.get(next)));
        }
		
	}

}
