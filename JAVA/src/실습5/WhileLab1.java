package 실습5;

public class WhileLab1 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*6)+5;
		System.out.println("[for결과]");
		for(int i=1;i<=n;i++) {
			System.out.println(i+"->"+(int)Math.pow(i,2));
		}
		System.out.println("[while결과]");
		int i=1;
		while(true) {
			System.out.println(i+"->"+(int)Math.pow(i,2));
			if(i==n) {
				break;
			}
			i++;
		}
	}

}
