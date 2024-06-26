package 실습6;

public class ArrayLab4 {

	public static void main(String[] args) {
		int n = (int)(Math.random()*6)+5;
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = (int)(Math.random()*26)+1;
		}
		char[] c = new char[n];
		for(int i=0;i<n;i++) {
			c[i] = (char)(arr[i]+96);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			if(i!=n-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(c[i]);
			if(i!=n-1) {
				System.out.print(",");
			}
		}
	}

}
