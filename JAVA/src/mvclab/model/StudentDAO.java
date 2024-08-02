package mvclab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mvc.model.service.ConnectJdbcTest;

public class StudentDAO {
	
	public List<StudentDTO> getAllStudent(){
		Connection conn = ConnectJdbcTest.connect();
		Statement stmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(
					"SELECT NAME,SCORE FROM STUDENT");
			StudentDTO dto = null;
			while (rs.next()) {
				dto = new StudentDTO();
				dto.setName(rs.getString("NAME"));
				dto.setScore(rs.getInt("SCORE"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt, rs, conn);
		}
		return list;
	}
	
	
	public boolean insertStudent(StudentDTO dto) {
		Connection conn = ConnectJdbcTest.connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO student VALUES(?,?)");
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getScore());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println("meeting insert 과정에서 오류 발생 " + e);
			return false;
		} finally {
			close(pstmt, null, conn);
		}
		
	}
	

	public int getScore(StudentDTO dto) {
		Connection conn = ConnectJdbcTest.connect();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		int score = -1;
		try {
			pstmt = conn.prepareStatement("SELECT score FROM STUDENT where name = ?");
			pstmt.setString(1, dto.getName());
			rs = pstmt.executeQuery();
			while(rs.next()) {
	            score = rs.getInt("score");
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, rs, conn);
		}
		return score;
		
	}
	
	public boolean updateStudent(StudentDTO dto) {

		boolean result = true;
		Connection conn = ConnectJdbcTest.connect();
		try (PreparedStatement pstmt = conn.prepareStatement(
						"update student set score = ? where name = ?");) {
			pstmt.setInt(1,  dto.getScore());
			pstmt.setString(2,  dto.getName());
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		} finally {
			ConnectJdbcTest.close(conn);
		}
		return result;
		
	}
	
	public boolean deleteStudent(StudentDTO dto) {
		Connection conn = ConnectJdbcTest.connect();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("DELETE FROM student WHERE name = ?");
			pstmt.setString(1, dto.getName());
			if (pstmt.executeUpdate() != 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			System.err.println("delete 과정에서 오류 발생 " + e);
			return false;
		} finally {
			close(pstmt, null, conn);
		}
	}
	

	private void close(Statement s, ResultSet r, Connection conn) {
		try {
			if (r != null)
				r.close();
			if (s != null)
				s.close();
			ConnectJdbcTest.close(conn);
		} catch (SQLException e) {
			System.err.println("close과정에서 문제 발생" + e);
		}
	}
}
