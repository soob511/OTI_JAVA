package 실습2;

public class AlphaTest {

	public static void main(String[] args) {
		int num = (int)(Math.random()*26)+1;
		System.out.println("추출된 숫자:" + num);
		char c = (char)(num+64);
		System.out.println(c);

	}

}
