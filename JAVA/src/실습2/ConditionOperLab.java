package 실습2;

public class ConditionOperLab {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 5 )+ 1;
		if (n == 1) {
			n = 300 + 50;
		} else if (n == 2) {
			n = 300 - 50;
		} else if (n == 3) {
			n = 300 * 50;
		} else if (n == 4) {
			n = 300 / 50;
		} else {
			n = 300 % 50;
		}
		System.out.println(n);
	}

}
