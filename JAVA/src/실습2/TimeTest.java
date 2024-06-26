package 실습2;

public class TimeTest {

	public static void main(String[] args) {
		int time = 32150;
		System.out.print(time / 1000 + "시간");
		time %= 1000;
		System.out.print(time / 10 + "분");
		time %= 10;
		System.out.println(time / 1 + "초");

	}

}
