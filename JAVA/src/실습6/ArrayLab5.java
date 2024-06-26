package 실습6;

public class ArrayLab5 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		boolean[] visit = new boolean[46];
		for(int i=0;i<6;i++) {
			while(true) {
				int n =(int)(Math.random()*45)+1;
				if(!visit[n]) {
					visit[n] = true;
					arr[i] = n;
					break;
				}
			}
		}
		System.out.print("오늘의 로또 번호 -");
		for(int i=0;i<6;i++) {
			System.out.print(arr[i]);
			if(i!=5) {
				System.out.print(",");
			}
		}
	}

}
