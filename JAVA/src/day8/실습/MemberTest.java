package day8.실습;

class Member{
	String name;
	String account;
	String passwd;
	int birthyear;
}

public class MemberTest {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		m1.name = "수빈";
		m1.account = "soobin";
		m1.passwd = "1234";
		m1.birthyear = 98;
		
		m2.name = "승우";
		m2.account = "aisbwidb";
		m2.passwd = "5678";
		m2.birthyear = 97;
		
		m3.name = "원석";
		m3.account = "jqocnw";
		m3.passwd = "9876";
		m3.birthyear = 95;
		
		System.out.println("회원1 : " + m1.name+"("+m1.account+","+m1.passwd+","+m1.birthyear+")");
		System.out.println("회원2 : " + m2.name+"("+m2.account+","+m2.passwd+","+m2.birthyear+")");
		System.out.println("회원3 : " + m3.name+"("+m3.account+","+m3.passwd+","+m3.birthyear+")");
	}

}
