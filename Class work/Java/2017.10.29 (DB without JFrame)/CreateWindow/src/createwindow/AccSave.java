
package createwindow;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AccSave {
    String url="jdbc:mysql://localhost:3306/db1";
    String user="root";
    String pass="apcl123456";
    Connection con;
    PreparedStatement pstm;
    public boolean createDB(){
        boolean ret=false;
        url="jdbc:mysql://localhost:3306";
        try {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           pstm=con.prepareStatement("CREATE DATABASE db1");

           int i=pstm.executeUpdate();
           if(i>0){
               ret= true;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                pstm.close();
                con.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return ret;
    }
    public boolean createTable(){
        boolean ret=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           pstm=con.prepareStatement("CREATE TABLE account(id int(4) primary key, name varchar(20), Type varchar(20), branch varchar(20), date varchar(20), balance float(6))");

           int i=pstm.executeUpdate();
           if(i==0){
               ret= true;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                pstm.close();
                con.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return ret;
    }
    public boolean doSave(Account x){
        boolean ret=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           pstm=con.prepareStatement("INSERT INTO account(id, name, type, branch, date, balance) VALUES(?,?,?,?,?,?)");
           pstm.setInt(1, x.getId());
           pstm.setString(2, x.getName());
           pstm.setString(3, x.getType());
           pstm.setString(4, x.getBranch());
           pstm.setString(5, x.getDate());
           pstm.setDouble(6, x.getBalance());
           int i=pstm.executeUpdate();
           if(i>0){
               ret= true;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                pstm.close();
                con.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return ret;
    }
    public boolean doUpdate(Account x){
        boolean ret=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           pstm=con.prepareStatement("UPDATE account SET name=?, type=?, branch=?, date=?, balance=? WHERE id=?)");
           
           pstm.setString(1, x.getName());
           pstm.setString(2, x.getType());
           pstm.setString(3, x.getBranch());
           pstm.setString(4, x.getDate());
           pstm.setDouble(5, x.getBalance());
           pstm.setInt(6, x.getId());
           int i=pstm.executeUpdate();
           if(i>0){
               ret= true;
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                pstm.close();
                con.close();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return ret;
    }
}
