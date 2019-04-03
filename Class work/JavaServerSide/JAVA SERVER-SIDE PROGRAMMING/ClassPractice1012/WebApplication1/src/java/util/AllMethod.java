package util;

import conn.ConnectDB;
import impl.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AllMethod {

    Connection con;
    PreparedStatement pstm;

    public boolean doSave(Student s) {
        boolean ret = false;
        ConnectDB cd = new ConnectDB();

        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("insert into student4 values(?,?,?,?,?)");
            pstm.setInt(1, s.getId());
            pstm.setString(2, s.getName());
            pstm.setString(3, s.getPassword());
            pstm.setString(4, s.getEmail());
            pstm.setString(5, s.getGender());
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AllMethod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException e) {

            }
        }
       return ret;     
    }
     public boolean doDelete(int s) {
        boolean ret = false;
        ConnectDB cd = new ConnectDB();

        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("delete from student4 where id=?)");
            pstm.setInt(1, s);
         
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AllMethod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException e) {

            }
        }
       return ret;     
    }
     public ArrayList<Student> findAllStudent() {
        ConnectDB cd = new ConnectDB();
        ArrayList<Student> allSt = new ArrayList<>();
         ResultSet rs =null;
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("SELECT * FROM student4");
             rs = pstm.executeQuery();
            while (rs.next()) {
                Student  p = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));

                allSt.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return allSt;
    } 
   public Student findOneStudent(int id) {
        ConnectDB cd = new ConnectDB();
      Student p=null;
         ResultSet rs =null;
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("SELECT * FROM student4 where id=?");
            pstm.setInt(1, id);
             rs = pstm.executeQuery();
            while (rs.next()) {
                  p = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));

               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return p;
    }
}
