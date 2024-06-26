package 실습3;

public class SwitchLab2 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 5 )+ 1;
		switch(n) {
		case 1:
			n = 300 + 50;
			break;
		case 2:
			n = 300 - 50;
			break;
		case 3:
			n = 300 * 50;
			break;
		case 4:
			n = 300 / 50;
			break;
		case 5:
			n = 300 % 50;
			break;
		}

		System.out.println(n);
	}

}
