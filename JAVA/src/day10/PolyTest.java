package day10;

public class PolyTest {

	public static void main(String[] args) {
		 printObjectInfo(new Object());
		 printObjectInfo("ABC");
		 printObjectInfo("가나다");
		 printObjectInfo(new java.util.Date());
		 printObjectInfo(new java.io.File("c:/Temp"));
		 printObjectInfo(new day09.Card());
		 printObjectInfo(new int[10]);
		 printObjectInfo(new double[] {10.5,3.14});
		 printObjectInfo(100); //java 5 Auto Boxing 구문 - 객체가 와야할자리에 기본형이오면 자동으로 객체로 바꿔줌
		 printObjectInfo('가');
		 printObjectInfo(true);
	}
	static void printObjectInfo(Object o) {
		if(o instanceof String) {
			System.out.println("문자열 객체의 클래스명: "+o.toString());
		}else {
			System.out.println("전달된 객체의 클래스명: "+o.getClass().getName());
		}
		
	}

}
