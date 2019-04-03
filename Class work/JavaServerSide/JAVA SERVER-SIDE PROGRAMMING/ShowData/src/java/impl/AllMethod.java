
package impl;

import conn.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Student;


public class AllMethod {
    PreparedStatement pstm;
    Connection con;
    public boolean doSave(Student s){
        boolean ret=false;
        ConnectDB cd=new ConnectDB();
        try{
            con=cd.doConnect();
        pstm=con.prepareStatement("insert into student1 values(?,?,?,?,?)");
        pstm.setInt(1, s.getId());
        pstm.setString(2, s.getName());
        pstm.setString(3, s.getEmail());
        pstm.setString(4, s.getPhone());
        pstm.setString(5, s.getAddress());
        int i=pstm.executeUpdate();
        if(i>0){
         ret=true;
        }
        
        }catch(SQLException e){
        
        }finally{
           try{
           pstm.close();
           con.close();
           }catch(SQLException e){
           
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
            pstm = con.prepareStatement("SELECT * FROM student1");
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
    public Student findStudentBy(int id) {
        ConnectDB cd = new ConnectDB();
         Student p=null;
         ResultSet rs =null;
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("SELECT * FROM student1");
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
