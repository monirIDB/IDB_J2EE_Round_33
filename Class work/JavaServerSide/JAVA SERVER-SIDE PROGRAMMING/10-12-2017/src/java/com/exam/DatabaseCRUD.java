package com.exam;

import com.pojo.Student;
import com.util.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseCRUD {

    ConnectDB cd = new ConnectDB();
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public boolean doInsert(Student s) {
        boolean ret = false;
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("INSERT INTO student(id,name,pass,email,gender) VALUES(?,?,?,?,?)");
            pstm.setInt(1, s.getId());
            pstm.setString(2, s.getName());
            pstm.setString(3, s.getPass());
            pstm.setString(4, s.getEmail());
            pstm.setString(5, s.getGender());
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret=true;
            } 
        } catch (Exception e) {
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return ret;

    }

    public ArrayList<Student> findAllStudent() {
        ArrayList<Student> allStu = new ArrayList<>();
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("SELECT * FROM student");
            rs = pstm.executeQuery();
            while (rs.next()) {
                Student s = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                allStu.add(s);
            }

        } catch (Exception e) {
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return allStu;

    }

    public Student findStudentById(int id) {
        Student s = null;
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("SELECT * FROM student where id=?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setPass(rs.getString(3));
                s.setEmail(rs.getString(4));
                s.setGender(rs.getString(5));
            }

        } catch (Exception e) {
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return s;

    }
}
