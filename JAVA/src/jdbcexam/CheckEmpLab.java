package jdbcexam;

import java.sql.*;
import java.util.Scanner;

public class CheckEmpLab {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "SCOTT";
        String passwd = "TIGER";
        Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
        Statement stmt = conn.createStatement();
        Scanner sc = new Scanner(System.in);
        boolean has = true;

        do {
            System.out.print("직원 이름을 입력하세요: ");
            String name = sc.next().toUpperCase(); 
            ResultSet rs = stmt.executeQuery("SELECT ENAME, TO_CHAR(HIREDATE, 'YYYY\"년\" MM\"월\"'), DEPTNO FROM EMP WHERE ENAME='" + name + "'");

            if (rs.next()) {
                System.out.println(name + " 직원은 근무중입니다.");
                System.out.println(rs.getString(2) + "에 입사했고 현재 " + rs.getString(3) + "번 부서에서 근무하고 있습니다.");
            } else {
                System.out.println(name + " 직원은 근무하지 않습니다.");
            }

            rs.close();

            System.out.println("계속 진행? 1.예  2.아니요");
            int num = sc.nextInt();
            has = (num == 1);
        } while (has);

        sc.close();
        stmt.close();
        conn.close();
    }
}
