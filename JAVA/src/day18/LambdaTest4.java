package day18;

//@FunctionalInterface 
interface Test {//abstract 메소드가 하나여야 함수형 인터페이스임
	void run();

	void print();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		Test test = new Test() {
			@Override
			public void run() {
				System.out.println("run");
			}

			@Override
			public void print() {
				System.out.println("print");
			}
		};
		test.run();
		test.print();
	}
}
