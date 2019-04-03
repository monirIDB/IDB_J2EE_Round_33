   package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseCURD {

    public Student findStudentByEmail(String email, String password) {
        ResultSet rs;
        Student s=null;
        try {
       
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "apcl123456");
            PreparedStatement pstm = con.prepareStatement("select * from student where email=? and password=?");

            pstm.setString(3, email);
            pstm.setString(4, password);
            rs = pstm.executeQuery();

            while (rs.next()) {
                s = new Student();
                rs.getString(2);
                rs.getString(3);
                rs.getString(4);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
