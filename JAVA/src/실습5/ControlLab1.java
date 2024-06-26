package 실습5;

public class ControlLab1 {

	public static void main(String[] args) {
		int count=0;
		while(true) {
			int n = (int)(Math.random()*11)+10;
			if(n%3==0||n%5==0) {
				count++;
				int sum=0;
				for(int i=1;i<=n;i++) {
					sum+=i;
				}
				System.out.println(sum);
			}else if(n==11||n==17||n==19) {
				System.out.println(count+"번 반복함");
				break;
			}else {
				System.out.println("재수행");
			}
		}
	}

}
