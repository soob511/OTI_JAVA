package 실습3;

public class ForLab3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10+1);
		int b = (int)(Math.random()*11+30);
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("X부터 Y가지의 짝수의 합:"+ sum);
	}

}
