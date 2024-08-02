package mvclab.view;

import java.util.Scanner;

import mvclab.controller.StudentController;

public class StudentMain {

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		while (true) {
			System.out.println("처리하려는 기능을 선택하세요\n" + "1. 학생 정보 출력\n" + "2. 학생 정보 입력\n" + "3. 학생 정보 삭제\n"
					+ "4. 학생 정보 수정\n" + "5. 학생 점수 확인\n" + "6. 종료\n" + "입력: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			if (n == 1)
				sc.printAll();
			else if (n == 2) {
				System.out.println("이름입력:");
				System.out.println("점수입력:");
				String name = scan.next();
				int score = scan.nextInt();
				sc.insert(name, score);
			} else if (n == 3) {
				System.out.println("이름입력:");
				String name = scan.next();
				sc.delete(name);
			} else if (n == 4) {
				System.out.println("이름입력:");
				System.out.println("점수입력:");
				String name = scan.next();
				int score = scan.nextInt();
				sc.update(name, score);
			} else if (n == 5) {
				System.out.println("이름입력:");
				String name = scan.next();
				sc.printScore(name);
			} else if (n == 6) {
				break;
			}
		}

	}

}
