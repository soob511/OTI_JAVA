package day8;

class Student2{
	String name;
	int grade;
	String subject;
	
	Student2(){
		this("둘리",3,"JavaScript");
	}
	Student2(String name,int grade,String subject){
		this.name = name;
		this.grade = grade;
		this.subject =subject;
	}
	
	void study() {
		System.out.println(name + "학생은 "+subject+"과목을 학습합니다");
	}
	String getStudentInfo() {
		return name+"학생은 " + grade + "학년입니다." ;
	}
}
public class StudentTest2 {
	public static void main(String[] args) {
		Student2 st1 = new Student2();
		System.out.println(st1);
		st1.study();
		System.out.println(st1.getStudentInfo());

		Student2 st2 = new Student2("듀크",3,"SQL");

		st2.study();
		System.out.println(st2);
		System.out.println(st2.getStudentInfo());
		System.out.println("St2 = st1 수행");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1.getStudentInfo());
		System.out.println(st2.getStudentInfo());

	}

}
