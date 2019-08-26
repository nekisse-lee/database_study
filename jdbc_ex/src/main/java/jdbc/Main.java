package jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String host = "jdbc:mysql://127.0.0.1/nekissedb2";
        String user = "nekisse";
        String password = "dltjsgh";
        String insert = "insert into stu values(?,?,?)";
        String sql = "select * from stu";

        Connection conn = DriverManager.getConnection(host, user, password);
        Statement stmt = conn.createStatement();
        PreparedStatement pstmt;
//        String insert = "insert into stu values(" + sno + ",'" + sname + "',1)";
        pstmt = conn.prepareStatement(insert);

        //insert using pstmt
        String sname = "정호영";
        int sno = 7;
        int pid = 1;
        pstmt.setInt(1, sno);
        pstmt.setString(2, sname);
        pstmt.setInt(3, pid);
        pstmt.execute();

//        String update = "update stu set pid=2";

        //update
//        int n = stmt.executeUpdate(update);
//        System.out.println("update result: " + n);
        //insert
//        stmt.execute(insert);
        //select
        ResultSet resultSet = stmt.executeQuery(sql);
        while (resultSet.next()) {
            int n = resultSet.getInt(1);
            String name = resultSet.getString("name");
            pid = resultSet.getInt("pid");
//            System.out.printf("%d %s %d \n", n,name,pid);
            System.out.println(n + " " + name + " " + pid);
        }

        System.out.println("OK");


        stmt.close();
        pstmt.close();
        conn.close();
    }

}

