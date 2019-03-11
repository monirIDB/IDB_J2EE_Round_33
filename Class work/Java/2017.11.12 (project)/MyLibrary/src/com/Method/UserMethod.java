
package com.Method;


import com.LibClass.NewBook;
import com.LibClass.NewUser;
import com.connection.DoCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMethod {
    Connection con;
    PreparedStatement pstm;
    public boolean doSave(NewUser nu) {
        DoCon dc = new DoCon();
        boolean ret = false;

        try {
            con = dc.doCon();
            pstm = con.prepareStatement("INSERT INTO user_info VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setInt(1, nu.getNo());
            pstm.setString(2, nu.getId());
            pstm.setString(3, nu.getPass());
            pstm.setString(4, nu.getName());
            
            pstm.setString(5, nu.getEmail());
            pstm.setString(6, nu.getMobile());
            pstm.setString(7, nu.getReligion());
            pstm.setString(8, nu.getSex());
            pstm.setString(9, nu.getProffesion());
            java.sql.Date sd = new java.sql.Date(nu.getDate().getTime());
            pstm.setDate(10, sd);
            pstm.setInt(11, nu.getAge());
            pstm.setString(12, nu.getPhoto());
           
            pstm.setString(13, nu.getAddress());

            int i = pstm.executeUpdate();
            if (i > 0) {

                ret = true;
            }

        } catch (Exception e) {
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }
    public NewUser findUser(String id){
        //ArrayList<Account> allAcc = new ArrayList<>();
        DoCon dc=new DoCon();
         con = dc.doCon();
         NewUser nu = null;
         
        try {
            pstm = con.prepareStatement("SELECT * FROM user_info WHERE user_id=?");
            pstm.setString(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
            nu = new NewUser();
              nu.setNo(rs.getInt(1));
              nu.setId(rs.getString(2));
              nu.setPass(rs.getString(3));
              nu.setName(rs.getString(4));
              nu.setEmail(rs.getString(5));
              nu.setMobile(rs.getString(6));
              nu.setReligion(rs.getString(7));
              nu.setSex(rs.getString(8));
              nu.setProffesion(rs.getString(9));
              nu.setDate(rs.getDate(10));
              nu.setAge(rs.getInt(11));
              nu.setPhoto(rs.getString(12));
              nu.setAddress(rs.getString(13));
              
              
              
             
              //allAcc.add(ac1);
                
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
        return nu;
    }
}
