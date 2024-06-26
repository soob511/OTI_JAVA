package 실습4;

public class ForLab6 {

	public static void main(String[] args) {
		char c = '&';
		int n = (int)(Math.random()*6)+5;
		if(n==5||n==7) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
	}

}
