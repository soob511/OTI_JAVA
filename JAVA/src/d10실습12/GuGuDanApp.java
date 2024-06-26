package d10실습12;

class Multiplication {
	private int dan;
	private int number;

	Multiplication() {
	}

	Multiplication(int dan) {
		this.dan = dan;
	}

	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication {
	GuGuDanExpr() {
	}

	GuGuDanExpr(int dan) {
		super(dan);
	}

	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}

	public static void printAll() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}

public class GuGuDanApp {
	public static void main(String[] args) {
		int dan = (int) (Math.random() * 20) + 1;
		int number = (int) (Math.random() * 20) + 1;
		//System.out.println(dan + " " + number);
		GuGuDanExpr gu;
		if ((dan >= 1 && dan <= 9)) {
			if ((number >= 1 && number <= 9)) {
				gu = new GuGuDanExpr(dan, number);
			} else {
				gu = new GuGuDanExpr(dan);
			}
			gu.printPart();
		} else if (dan >= 10) {
			gu = new GuGuDanExpr();
			gu.printAll();
		}

	}

}
