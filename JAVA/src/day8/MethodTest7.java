package day8;

public class MethodTest7 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		System.out.println(args.length);
		System.out.println(args[0] + args[1] + args[2]);
		System.out.println("main() 수행종료");
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i < arr.length - 1 ? arr[i] + ", " : arr[i]);
		}
	}
}
