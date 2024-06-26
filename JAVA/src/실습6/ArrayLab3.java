package 실습6;

public class ArrayLab3 {

	public static void main(String[] args) {
		char[] c = new char[]{'J','a','v','a'};
		for(int i=0;i<c.length;i++) {
			if(c[i]<91) {
				c[i] += 32;
			}else {
				c[i] -=32;
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}

	}

}
