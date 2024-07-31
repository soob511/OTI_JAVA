package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	    String user = "SCOTT";
	    String passwd = "TIGER";
		Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
		Statement stmt = conn.createStatement();
		Random rm = new Random(); 
		ResultSet rs;
		if(rm.nextBoolean()) {
			 rs = stmt.executeQuery("SELECT ENAME,TO_CHAR(SAL,'99,999') TSAL FROM EMP");
			while(rs.next()) {
				System.out.print(rs.getString("ENAME")+" 직원의 월급은");
				System.out.println(rs.getString("TSAL")+"달러입니다.");
			}
		}else {
			 rs = stmt.executeQuery("SELECT ENAME,TO_CHAR(HIREDATE,'YYYY\"년\"MM\"월\"DD\"일\"') FROM EMP ORDER BY HIREDATE");
			while(rs.next()) {
				System.out.print(rs.getString(1)+" 직원은 ");
				System.out.println(rs.getString(2)+"에 입사하였습니다.");
			}
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}

}
