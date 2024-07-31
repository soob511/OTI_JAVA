package jdbcexam;

import java.sql.*;
import java.util.Scanner;

public class SelectBookLab {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
		Scanner sc = new Scanner(System.in);
		boolean has = true;
		do {
			System.out.println("1.모두 출력하기");
			System.out.println("2.가격이 높은 순으로 출력하기");
			System.out.println("3.20000 이상의 도서들만 출력하기");
			System.out.println("4.웹 프로그래밍 도서들만 출력하기");
			System.out.println("5.데이터베이스와 인프라 도서들만 출력하기");
			System.out.println("6.도서명에 '자바'를 포함하는 도서들만 출력하기");
			System.out.println("7.분류별 도서 가격의 평균을 출력하기");
			System.out.println("원하는 메뉴의 번호를 선택: ");
			int num = sc.nextInt();
			Statement stmt = conn.createStatement();
			String sql = "";
			ResultSet rs;
			if (num == 1) {
				sql = "SELECT ID,TITLE,TO_CHAR(PRICE,'99,999')||'원',CLASS FROM BOOK";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-5s %-30s %-10s %-10s\n", "ID", "TITLE", "PRICE", "CLASS");
				System.out.println("-----------------------------------------------------------");
				while (rs.next()) {
					System.out.printf("%-5s %-30s %-10s %-10s\n", rs.getString(1), rs.getString(2), rs.getString(3),
							rs.getString(4));
				}
			} else if (num == 2) {
				sql = "SELECT ID,TITLE,TO_CHAR(PRICE,'99,999')||'원',CLASS FROM BOOK ORDER BY PRICE DESC";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-5s %-30s %-10s %-10s\n", "ID", "TITLE", "PRICE", "CLASS");
				System.out.println("-----------------------------------------------------------");
				while (rs.next()) {
					System.out.printf("%-5s %-30s %-10s %-10s\n", rs.getString(1), rs.getString(2), rs.getString(3),
							rs.getString(4));
				}
			} else if (num == 3) {
				sql = "SELECT TITLE,TO_CHAR(PRICE,'99,999')||'원' FROM BOOK WHERE PRICE >=20000";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-30s %-10s\n", "TITLE", "PRICE");
				System.out.println("-------------------------------------------");
				while (rs.next()) {
					System.out.printf("%-30s %-10s\n", rs.getString(1), rs.getString(2));
				}
			} else if (num == 4) {
				sql = "SELECT TITLE,TO_CHAR(PRICE,'99,999')||'원' FROM BOOK WHERE CLASS='b02'";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-30s %-10s\n", "TITLE", "PRICE");
				System.out.println("-------------------------------------------");
				while (rs.next()) {
					System.out.printf("%-30s %-10s\n", rs.getString(1), rs.getString(2));
				}
			} else if (num == 5) {
				sql = "SELECT TITLE,TO_CHAR(PRICE,'99,999')||'원' FROM BOOK WHERE CLASS='b04' or CLASS = 'b05'";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-30s %-10s\n", "TITLE", "PRICE");
				System.out.println("-------------------------------------------");
				while (rs.next()) {
					System.out.printf("%-30s %-10s\n", rs.getString(1), rs.getString(2));
				}
			} else if (num == 6) {
				sql = "SELECT TITLE,TO_CHAR(PRICE,'99,999')||'원'  FROM BOOK WHERE TITLE LIKE '%자바%'";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-30s %-10s\n", "TITLE", "PRICE");
				System.out.println("-------------------------------------------");
				while (rs.next()) {
					System.out.printf("%-30s %-10s\n", rs.getString(1), rs.getString(2));
				}
			} else if (num == 7) {
				sql = "SELECT CASE CLASS " + "WHEN 'b01' THEN '프로그래밍 언어' " + "WHEN 'b02' THEN '웹 프로그래밍' "
						+ "WHEN 'b03' THEN '빅데이터' " + "WHEN 'b04' THEN '데이터베이스' " + "WHEN 'b05' THEN '인프라' "
						+ "END || '들의 가격 평균은 ' || TO_CHAR(ROUND(AVG(PRICE), 0), '99,999') || '원입니다.' AS CLASS_AVG_PRICE "
						+ "FROM BOOK GROUP BY CLASS";
				rs = stmt.executeQuery(sql);
				System.out.printf("%-30s\n", "도서평균");
				System.out.println("----------------------------------------");
				while (rs.next()) {
					System.out.printf("%-30s\n", rs.getString(1));
				}

			}
			System.out.println();
			System.out.println("계속 입력하겠습니까?y/n");
			String answer = sc.next();
			if (answer.equals("n"))
				has = false;
			
			stmt.close();
			
		} while (has);
		sc.close();
		conn.close();
	}

}
