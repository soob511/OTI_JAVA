package d9실습11;

class AchademyFriend{
	static String academyName = "KOSA";
	String traineeName;
	String color;
	String hobby;
	String food;
	
	AchademyFriend(String traineeName, String color, String hobby, String food){
		this.traineeName = traineeName;
		this.color = color;
		this.hobby = hobby;
		this.food = food;
	}
	String getName() {
		return traineeName;
	}
	String getColor() {
		return color;
	}
	String getHobby() {
		return hobby;
	}
	String getFood() {
		return food;
	}
}

public class AFTest {

	public static void main(String[] args) {
		AchademyFriend[] a = {
				new AchademyFriend("양정윤", "보라색","운동","쌀국수"),
				new AchademyFriend("정원석", "초록색","축구","떡볶이"),
				new AchademyFriend("김채홍", "검정색","뜨개질","메밀소바")
		};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getName()+"동료는 좋아하는 칼라가 "+a[i].getColor()+
					"이며 취미는 "+a[i].getHobby()+"입니다. 그리고 제일 좋아하는 음식은 "+a[i].getFood()+
					"입니다.현재 "+AchademyFriend.academyName+"에서 학습하고 있어요.");
		}
	}
}
