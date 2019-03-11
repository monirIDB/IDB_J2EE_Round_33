
package com.impl;

import com.pojo.Product;
import com.util.ConnectDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DatabaseCURD {
    Connection con;
    PreparedStatement pstm;
    public boolean doInsert(Product p){
        boolean ret=false;
     ConnectDB cd= new ConnectDB();
        try {
            con=cd.doConnect();
            pstm=con.prepareStatement("INSERT INTO product01 VALUES(?,?,?,?)");
            pstm.setInt(1, p.getId());
            pstm.setString(2, p.getName());
            pstm.setDouble(3, p.getPrice());
            pstm.setInt(4, p.getStock());
            int i=pstm.executeUpdate();
            if(i>0){
                
                con.close();
                ret=true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }
    
    public boolean doDelete(Product account){
        boolean ret = false;
        ConnectDB cd= new ConnectDB();
        try {
            con=cd.doConnect();
            
            pstm=con.prepareStatement("DELETE FROM product01 WHERE id=?");
           
            pstm.setInt(1, account.getId());
            int i = pstm.executeUpdate();
            if(i>0){
                ret=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
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
    
    
    public boolean doUpdate(Product account){
        boolean ret = false;
        ConnectDB cd= new ConnectDB();
        try {
            con=cd.doConnect();
            pstm=con.prepareStatement("UPDATE product01 SET  name=?, price=?, stock=? where id=?");
            
            pstm.setString(1, account.getName());
//            pstm.setString(1, account.getAccType());
            pstm.setDouble(2, account.getPrice());
//            pstm.setString(4, account.getOpeningDate());
//            pstm.setDouble(5, account.getBalance());
            pstm.setInt(3, account.getStock());
            pstm.setInt(4, account.getId());
            int i = pstm.executeUpdate();
            if(i>0){
                ret=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
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
    
    public ArrayList<Product> findAllAcc(){
        ArrayList<Product> allAcc= new ArrayList<Product>();
        ConnectDB cd= new ConnectDB();
        try {
            
           con=cd.doConnect();
            pstm=con.prepareStatement("SELECT * FROM product01");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
            Product a = new Product();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setPrice(rs.getDouble(3));
            a.setStock(rs.getInt(4));
            
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
