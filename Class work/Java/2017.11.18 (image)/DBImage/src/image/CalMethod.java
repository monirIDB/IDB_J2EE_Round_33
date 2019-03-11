
package image;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CalMethod {
     Connection con;
    PreparedStatement pstm;
    public boolean doSave(DBimage p){
       DoConnetion dc=new DoConnetion();
        boolean ret=false;
        
        try {
            con = dc.doCon();
            pstm = con.prepareStatement("INSERT INTO load_image VALUES(?,?,?,?)");
            pstm.setInt(1, p.getId());
            pstm.setString(2, p.getName());
            pstm.setString(3, p.getEmail());
            pstm.setString(4, p.getImage());
            
            int i=pstm.executeUpdate();
            if(i>0){
                
                ret=true;
            }
            
        } catch (Exception e) {
        }finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }
    public ArrayList<DBimage> findAllProduct(){
        DoConnetion dc=new DoConnetion();
        ArrayList<DBimage> allAcc = new ArrayList<>();
         con = dc.doCon();
        try {
            pstm = con.prepareStatement("SELECT * FROM load_image");
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
              DBimage pro = new DBimage();
              pro.setId(rs.getInt(1));
              pro.setName(rs.getString(2));
              pro.setEmail(rs.getString(3));
              pro.setImage(rs.getString(4));
              
              
              allAcc.add(pro);
                
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
        return allAcc;
    }
     public DBimage findProduct(int id){
        //ArrayList<Account> allAcc = new ArrayList<>();
        DoConnetion dc=new DoConnetion();
         con = dc.doCon();
         DBimage pro = null;
         
        try {
            pstm = con.prepareStatement("SELECT * FROM load_image WHERE id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
             pro = new DBimage();
              pro.setId(rs.getInt(1));
              pro.setName(rs.getString(2));
              pro.setEmail(rs.getString(3));
              pro.setImage(rs.getString(4));
             
             
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
        return pro;
    }
}
