package day16;

public class Student2 {
	String name;
	int grade;
	String subject;

	Student2() {
		this("둘리", 3, "JavaScript");
	}

	Student2(String name, int grade, String subject) {
		this.name = name;
		this.grade = grade;
		this.subject = subject;
	}

	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다");
	}

	String getStudentInfo() {
		return name + "학생은 " + grade + "학년입니다.";
	}
}
