
package dbaccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DbConnection {
    String url="jdbc:mysql://localhost:3306/dbacc";
    String user="root";
    String pass="apcl1234";
    Connection con;
    PreparedStatement pstm;
    public boolean doSave(Account01 account){
        boolean ret = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pstm=con.prepareStatement("INSERT INTO account01(accNo, accName, accType, branch, openingDate, balance) VALUES(?,?,?,?,?,?)");
            pstm.setInt(1, account.getAccNo());
            pstm.setString(2, account.getAccName());
            pstm.setString(3, account.getAccType());
            pstm.setString(4, account.getBranch());
            pstm.setString(5, account.getOpeningDate());
            pstm.setDouble(6, account.getBalance());
            int i = pstm.executeUpdate();
            if(i>0){
                ret=true;
            }
        } catch (Exception e) {
            
        }finally{
            try {
                pstm.close();
                con.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }
    public boolean doUpdate(Account01 account){
        boolean ret = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pstm=con.prepareStatement("UPDATE account01 SET  accName=?, branch=? where accNo=?");
            
            pstm.setString(1, account.getAccName());
//            pstm.setString(1, account.getAccType());
            pstm.setString(2, account.getBranch());
//            pstm.setString(4, account.getOpeningDate());
//            pstm.setDouble(5, account.getBalance());
            pstm.setInt(3, account.getAccNo());
            int i = pstm.executeUpdate();
            if(i>0){
                ret=true;
            }
        } catch (Exception e) {
            
        }finally{
            try {
                pstm.close();
                con.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }
    public boolean doDelete(Account01 account){
        boolean ret = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pstm=con.prepareStatement("DELETE FROM account01 where accNo=?");
           
            pstm.setInt(1, account.getAccNo());
            int i = pstm.executeUpdate();
            if(i>0){
                ret=true;
            }
        } catch (Exception e) {
            
        }finally{
            try {
                pstm.close();
                con.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }
    public List<Account01> findAllAcc(){
        List<Account01> allAcc= new ArrayList<Account01>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
           
            pstm=con.prepareStatement("SELECT * FROM account01");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
            Account01 a = new Account01();
            a.setAccNo(rs.getInt(1));
            a.setAccName(rs.getString(2));
            a.setAccType(rs.getString(3));
            a.setBranch(rs.getString(4));
            a.setOpeningDate(rs.getString(5));
            a.setBalance(rs.getDouble(6));
            allAcc.add(a);
            }
           
        } catch (Exception e) {
            
        }finally{
            try {
                pstm.close();
                con.close();
            } catch(SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return allAcc;
    }
}

