package 실습4;

public class ForLab9 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*2)+1;
		if(n==1) {
			for(int i=1;i<10;i+=2) {
				for(int j=1;j<10;j++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}else {
			for(int i=2;i<10;i+=2) {
				for(int j=1;j<10;j++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}

	}

}
