package 실습3;

public class ForLab5 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*8)+3;
		int b = (int)(Math.random()*3)+1;
		if(b==1) {
			for(int i=0;i<a;i++) {
				System.out.print("*");
			}
		}else if(b==2) {
			for(int i=0;i<a;i++) {
				System.out.print("$");
			}
		}else{
			for(int i=0;i<a;i++) {
				System.out.print("#");
			}
		}
	}

}
