package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "jdbctest";
	    String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
		Scanner sc = new Scanner(System.in);
		boolean has = true;
		int count =0;
		do {
			count++;
			System.out.println("도서명을 입력하세요:");
			String name = sc.next();
			System.out.println("가격을 입력하세요:");
			String price = sc.next();
			System.out.println("도서분류에 대한 넘버를 입력하세요:");
			System.out.println("1.프로그래밍 언어");
			System.out.println("2.웹 프로그래밍");
			System.out.println("3.빅데이터");
			System.out.println("4.데이터베이스");
			System.out.println("5.인프라");
			int num = sc.nextInt();
			String number = "";
			if(num==1)number = "b01";
			else if(num==2)number = "b02";
			else if(num==3)number = "b03";
			else if(num==4)number= "b04";
			else if(num==5)number = "b05";
			String sql = "INSERT INTO book VALUES (book_seq.nextval, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, price);
			pstmt.setString(3, number);
			int updateNum = pstmt.executeUpdate();
			
			System.out.println("계속 입력하겠습니까?y/n");
			String answer = sc.next();
			if(answer.equals("n"))has = false;
			
		}while(has);
		System.out.println(count+"개의 데이터 입력 완료!");
		sc.close();
		conn.close();
	}

}
