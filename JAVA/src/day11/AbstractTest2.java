package day11;

abstract class Shape { //객체생성은 안되고 상속으로만 가능
	String color;

	abstract void draw(); // 블록있으면 안됌 abstract 메소드

	void setColor(String color) {
		this.color = color;
	}
}

class Circle2 extends Shape {
	void draw() {//자식에서 메소드 구현
		System.out.println(color + " 원을 그리는 기능");
	}
}

class Rectangle2 extends Shape {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle2 extends Shape {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class AbstractTest2 {
	public static void main(String args[]) {
		Shape s = new Circle2();
		s.setColor("파란색");
		printInfo(s);
		s = new Rectangle2();
		s.setColor("분홍색");
		printInfo(s);
		s = new Triangle2();
		s.setColor("연두색");
		printInfo(s);
	}

	static void printInfo(Shape obj) {
		obj.draw();
	}
}
