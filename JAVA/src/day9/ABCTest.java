package day9;

class A{
	A(){
		System.out.println("A클래스의 객체 초기화");
	}
}
class B extends A{
	B(int num){
		System.out.println("B클래스의 객체 초기화");
	}
}
class C extends B{
	C(){
		super(10);
		System.out.println("C클래스의 객체 초기화");
	}
}

public class ABCTest {
	public static void main(String[] args) {
		new C();

	}

}
