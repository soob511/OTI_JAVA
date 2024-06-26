package 실습5;

public class WhileLab3 {

	public static void main(String[] args) {
		int count =0;
		while(true) {
			int n = (int)(Math.random()*31);
			if(n>0&&n<27) {
				count++;
				System.out.println(n+"-"+(char)(n+64));
			}else {
				System.out.println("출력횟수는"+count+"번입니다.");
				break;
			}
		}

	}

}
