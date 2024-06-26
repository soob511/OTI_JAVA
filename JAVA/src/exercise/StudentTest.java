package exercise;

class Human {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Human() {

	}

	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String printInformation() {
		return name+"\t"+age+"\t"+height+"\t"+weight;

	}
}

class Student extends Human {
	private String number;
	private String major;

	public Student() {

	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	public String printInformation() {
		return super.printInformation()+"\t"+number+"\t"+major;
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 20, 171, 81, "201101", "영문");
		st[1] = new Student("고길동",21,183,72,"201102","건축");
		st[2] = new Student("박길동",22,175,65,"201103","컴공");
		for(Student num:st) {
			System.out.println(num.printInformation());
		}
	}

}
