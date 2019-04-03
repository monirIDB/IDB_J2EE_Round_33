
package com.Exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class Student {
    private int id;
    private String name;
    private String email;
    private Date dob;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        String name="";
          try {

               

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
                PreparedStatement pstm = con.prepareStatement("select * from student3 where id=? and password=?");
                pstm.setInt(1, 1);
                pstm.setString(2, "100");

                ResultSet rs = pstm.executeQuery();
                  int r=rs.getRow();
                
                while (rs.next()) {
                    name = rs.getString(2);
                   
                }
              

            } catch (ClassNotFoundException ex) {

            } catch (SQLException e) {

            }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
     public Student() {
         this.dob=new Date();
    }

    public Student(int id, String name, String email, Date dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
    
    
}
