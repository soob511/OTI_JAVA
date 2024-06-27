package day18;

interface Sample {
	int calc(int n);
}

class MyTest {//함수형 인터페이스를 달라고 할떄 람다식으로 구현 가능
	static void pr(Sample p) {
		System.out.println(p.calc(10));
	}
}

public class LambdaTest1 {
	public static void main(String[] args) {
		class SampleImpl implements Sample {
			public int calc(int n) {
				return n + 1;
			}
		}
		Sample obj = new SampleImpl();
		MyTest.pr(obj);

		MyTest.pr(new Sample() {
			public int calc(int n) {
				return n + 10;
			}
		});

		MyTest.pr((int n) -> {
			return n + 100;
		});
		MyTest.pr((n) -> {
			return n + 100;
		});
		MyTest.pr(n -> {
			return n + 100;
		});
		MyTest.pr(n -> n + 100);
	}
}
