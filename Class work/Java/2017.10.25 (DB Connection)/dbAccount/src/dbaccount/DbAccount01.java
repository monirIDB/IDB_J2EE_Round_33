
package dbaccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DbAccount01 {
//    String url="jdbc:mysql://localhost:3306/dbacc";
//    String user="root";
//    String pass="apcl123456";
//    Connection con;
//    PreparedStatement pstm;
    public static void main(String[] args) {
//        Account01 acc=new Account01(101, "Al Amin", "Savings", "Dhaka", "12-10-2017", 3400);
//        Account01 acc3=new Account01(102, "Al Amin", "Savings", "Dhaka", "12-10-2017", 3400);
//        Account01 acc1=new Account01(107, "Kamal", "Current", "Dhanmondi", "12-10-2017", 3400);
//        Account01 acc2=new Account01(108, "Jamal", "Savings", "Dhanmondi", "12-10-2017", 3400);
//        DbAccount01 dbAcc= new DbAccount01();
        DbConnection abc=new DbConnection();
        List<Account01> allAcc = abc.findAllAcc();
        
        for (Account01 account01:allAcc){
            //System.out.println(account01.getAccNo()+" "+account01.getAccName()+" "+account01.getAccType()+" "+account01.getOpeningDate()+" "+account01.getBranch()+" "+account01.getBalance());
            System.out.println(allAcc);
        }
//        boolean b=dbAcc.doSave(acc1);
//        boolean c=dbAcc.doSave(acc2);
//        if(b && c){
//            System.out.println("Data Saved");
//        }else{
//            System.out.println("Data Not Saved");
//        }
//        boolean d=dbAcc.doUpdate(acc);
//        if(d){
//            System.out.println("Data Saved");
//        }else{
//            System.out.println("Data Not Saved");
//        }
//        boolean e=dbAcc.doDelete(acc3);
//        if(e){
//            System.out.println("Data Saved");
//        }else{
//            System.out.println("Data Not Saved");
//        }
    }
//    public boolean doSave(Account01 account){
//        boolean ret = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection(url,user,pass);
//            pstm=con.prepareStatement("INSERT INTO account01(accNo, accName, accType, branch, openingDate, balance) VALUES(?,?,?,?,?,?)");
//            pstm.setInt(1, account.getAccNo());
//            pstm.setString(2, account.getAccName());
//            pstm.setString(3, account.getAccType());
//            pstm.setString(4, account.getBranch());
//            pstm.setString(5, account.getOpeningDate());
//            pstm.setDouble(6, account.getBalance());
//            int i = pstm.executeUpdate();
//            if(i>0){
//                ret=true;
//            }
//        } catch (Exception e) {
//            
//        }finally{
//            try {
//                pstm.close();
//                con.close();
//            } catch(SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return ret;
//    }
//    public boolean doUpdate(Account01 account){
//        boolean ret = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection(url,user,pass);
//            pstm=con.prepareStatement("UPDATE account01 SET  accName=?, branch=? where accNo=?");
//            
//            pstm.setString(1, account.getAccName());
////            pstm.setString(1, account.getAccType());
//            pstm.setString(2, account.getBranch());
////            pstm.setString(4, account.getOpeningDate());
////            pstm.setDouble(5, account.getBalance());
//            pstm.setInt(3, account.getAccNo());
//            int i = pstm.executeUpdate();
//            if(i>0){
//                ret=true;
//            }
//        } catch (Exception e) {
//            
//        }finally{
//            try {
//                pstm.close();
//                con.close();
//            } catch(SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return ret;
//    }
//    public boolean doDelete(Account01 account){
//        boolean ret = false;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection(url,user,pass);
//            pstm=con.prepareStatement("DELETE FROM account01 where accNo=?");
//           
//            pstm.setInt(1, account.getAccNo());
//            int i = pstm.executeUpdate();
//            if(i>0){
//                ret=true;
//            }
//        } catch (Exception e) {
//            
//        }finally{
//            try {
//                pstm.close();
//                con.close();
//            } catch(SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return ret;
//    }
//    public List<Account01> findAllAcc(){
//        List<Account01> allAcc= new ArrayList<Account01>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection(url,user,pass);
//            pstm=con.prepareStatement("SELECT * FROM account01");
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()){
//            Account01 a = new Account01();
//            a.setAccNo(rs.getInt(0));
//            a.setAccName(rs.getString(1));
//            a.setAccType(rs.getString(2));
//            a.setBranch(rs.getString(3));
//            a.setOpeningDate(rs.getString(4));
//            a.setBalance(rs.getDouble(5));
//            }
//           
//            pstm.setInt(1, account.getAccNo());
//            int i = pstm.executeUpdate();
//            if(i>0){
//                ret=true;
//            }
//        } catch (Exception e) {
//            
//        }finally{
//            try {
//                pstm.close();
//                con.close();
//            } catch(SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        
//        return allAcc;
//    }
}
