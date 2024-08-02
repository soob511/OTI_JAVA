package mvclab.controller;

import java.util.List;

import mvclab.model.StudentDAO;
import mvclab.model.StudentDTO;

public class StudentController {
	private StudentDAO dao;
	public StudentController() {
		dao = new StudentDAO();	
	}
	public void printAll() {
		List<StudentDTO> list = dao.getAllStudent(); 
		for(StudentDTO dto : list) {
			System.out.print(dto.getName()+"\t");
			System.out.println(dto.getScore());
		}
	}
	
	public void printScore(String name) {
		StudentDTO dto = new StudentDTO();
		dto.setName(name);
		int result = dao.getScore(dto);
		if(result>=0)
			System.out.println(name +"학생의 점수는 "+result+" 입니다.");
		else
			System.out.println(name+"학샘은 존재하지 않습니다.");
	}
	
	public void insert(String name, int score) {
		StudentDTO dto = new StudentDTO();
		dto.setName(name);
		dto.setScore(score);
		boolean result = dao.insertStudent(dto);
		if (result)
			System.out.println("입력성공");
		else 
			System.out.println("입력실패");
	}
	
	public void update(String name,int score) {
		StudentDTO dto = new StudentDTO();
		dto.setName(name);
		dto.setScore(score);
		boolean result = dao.updateStudent(dto);
		if (result)
			System.out.println(name +"학생의 점수를 변경했습니다.");
		else 
			System.out.println(name +"학생은 존재하지 않습니다.");
	}
	
	public void delete(String name) {
		StudentDTO dto = new StudentDTO();
		dto.setName(name);
		boolean result = dao.deleteStudent(dto);
		if (result)
			System.out.println(name +"학생의 데이터를 삭제했습니다. ");
		else 
			System.out.println(name +"학생은 존재하지않습니다.");
	}
}
