package 실습6;

public class ArrayLab1 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		for(int i=0;i<10;i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			ary[i] = (i+1)*10;
		}
		System.out.println(ary[0]);
		System.out.println(ary[9]);
		System.out.println(ary[0]+ary[9]);
		for(int i=0;i<10;i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		for(int i=9;i>=0;i--) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
		for(int i=1;i<10;i+=2) {
			System.out.print(ary[i]+" ");
		}
	}

}
