package 실습6;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for(int i=0;i<10;i++) {
			arr[i] = (int)(Math.random()*17)+4;
			sum+=arr[i];
		}
		System.out.print("모든 원소의 값 : ");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]);
			if(i!=9) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.print("모든 원소의 합 : "+sum);
	}

}
