package day18;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
public class GenericMethodTest {
	public static void main(String[] args) {
		testGM1(new Date());
		testGM1("가나다");
		testGM1(100);
		testGM1(3.14);
		
		testGM3(new ArrayList<String>());
		//testGM3(new ArrayList<Integer>());
		//testGM3(new ArrayList<Object>());
		
		testGM4(new ArrayList<String>());
		testGM4(new ArrayList<Object>());
		
		testGM5(new ArrayList<String>());
		testGM5(new ArrayList<Integer>());		
	}
	
	static <T> void testGM1(T p) {
		T obj = p;
		System.out.println("전달된 객체의 클래스명 : " 
				 +obj.getClass().getName());
	}	
	static void testGM3(List<String> p) {
		System.out.println(p.size());
	}

	static void testGM4(List<? super String> p) {
		System.out.println(p.size());
	}
	
	static void testGM5(List<?> p) {
		System.out.println(p.size());
	}
}
