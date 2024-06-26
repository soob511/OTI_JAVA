package day10;
class Parent {  
	int x = 1, y = 2;
}
class Child extends Parent {
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			// 	
		System.out.println(this.x);		//   
		System.out.println(super.x);	// 	
		System.out.println(y);			//  	
		System.out.println(this.y);		// 	
		System.out.println(super.y);	//   	
		//System.out.println(z);
	}
	public String toString() {
		return "Child 클래스의 객체임";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {		
		Child ch = new Child();
		ch.printInfo();
		//new Child().printInfo();
		System.out.println(ch.toString());
		System.out.println(ch);
		System.out.println("객체정보: "+ ch);
		System.out.println("현재시간: "+new java.util.Date());
		
	}
}



