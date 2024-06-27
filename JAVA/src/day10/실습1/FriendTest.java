package day10.실습1;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}

}
class Friend extends Person{
	private String phoneNum;
	private String email;

	Friend(String name,String phoneNum,String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo()+"\t"+phoneNum+"\t"+email;
	}
	
}
public class FriendTest {

	public static void main(String[] args) {
		Friend[] fr = {
				new Friend("ㄱㄴㄷ", "010-1234-5678", "asdfs@naver.com"),
				new Friend("ㅇㅇㅇ", "010-1658-5992", "sjcjei@naver.com"),
				new Friend("ㅁㅁㅁ", "010-9481-6516", "eoncms@naver.com"),
				new Friend("ㅅㅅㅅ", "010-6581-5671", "wojks@naver.com"),
				new Friend("ㄹㄹㄹ", "010-1535-6566", "sione@naver.com")
		};
		System.out.println("이름\t전화번호\t\t메일주소\t");
		System.out.println("-----------------------------------------");
		for(Friend num:fr) {
			System.out.println(num.getInfo());
		}
	}

}
