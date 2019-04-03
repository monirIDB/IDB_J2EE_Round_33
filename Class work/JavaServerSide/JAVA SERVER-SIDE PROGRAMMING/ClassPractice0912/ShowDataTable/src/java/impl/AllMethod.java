/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import conn.com.ConnectDB;
import exam.java.Student1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AllMethod {
     Connection con;
    PreparedStatement pstmt;

   
    
    
     
      public Student1 findDoctorById(int id) {
        ConnectDB cd = new ConnectDB();
        Student1 p = null;
        try {
            con = cd.doConnect();
            pstmt = con.prepareStatement("SELECT * FROM student3 WHERE id=?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                p = new Student1(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return p;
    }
     
      public ArrayList<Student1> findAllProduct() {
        ConnectDB cd = new ConnectDB();
        ArrayList<Student1> allPro = new ArrayList<>();
        try {
            con = cd.doConnect();
            pstmt = con.prepareStatement("SELECT * FROM student3");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
               Student1 p = new Student1(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));

                allPro.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return allPro;
}
}
