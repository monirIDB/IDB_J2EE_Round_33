
package Com.ProMethod;

import Com.DBCon.DoConnetion;
import Com.ProDB.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AllMethod {
    Connection con;
    PreparedStatement pstm;
    public boolean doSave(Product p){
       DoConnetion dc=new DoConnetion();
        boolean ret=false;
        
        try {
            con = dc.doCon();
            pstm = con.prepareStatement("INSERT INTO product VALUES(?,?,?,?,?)");
            pstm.setInt(1, p.getId());
            pstm.setString(2, p.getName());
            pstm.setDouble(3, p.getPrice());
            pstm.setFloat(4, p.getStock());
            pstm.setString(5,p.getOrigin());
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
    public boolean saveSales(Product p){
       DoConnetion dc=new DoConnetion();
        boolean ret=false;
        
        try {
            con = dc.doCon();
            pstm = con.prepareStatement("INSERT INTO pro_sales VALUES(?,?,?,?,?,?)");
            pstm.setInt(1, p.getSid());
            pstm.setInt(2, p.getId());
            pstm.setString(3, p.getName());
            pstm.setFloat(4, p.getPrice());
            pstm.setInt(5, p.getStock());
            pstm.setFloat(6,p.getTotal());
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
    public boolean doUpdate(Product p) {
        DoConnetion dc=new DoConnetion();
        boolean ret = false;
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("UPDATE product SET name=?, price=?, stock=?, origin=?  WHERE id=?");

           pstm.setString(1, p.getName());
            pstm.setFloat(2, p.getPrice());
            pstm.setInt(3, p.getStock());
            pstm.setString(4, p.getOrigin());
            pstm.setInt(5, p.getId());

            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
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
    public boolean doUpStock(Product p) {
        DoConnetion dc=new DoConnetion();
        boolean ret = false;
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("UPDATE product SET  stock=? WHERE id=?");

           pstm.setInt(1, p.getStock());
            pstm.setFloat(2, p.getId());
            

            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
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
    public Product findProduct(int id){
        //ArrayList<Account> allAcc = new ArrayList<>();
        DoConnetion dc=new DoConnetion();
         con = dc.doCon();
         Product pro = null;
         
        try {
            pstm = con.prepareStatement("SELECT * FROM product WHERE id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
             pro = new Product();
              pro.setId(rs.getInt(1));
              pro.setName(rs.getString(2));
              pro.setPrice(rs.getFloat(3));
              pro.setStock(rs.getInt(4));
              pro.setOrigin(rs.getString(5));
             
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
    public ArrayList<Product> findAllProduct(){
        DoConnetion dc=new DoConnetion();
        ArrayList<Product> allAcc = new ArrayList<>();
         con = dc.doCon();
        try {
            pstm = con.prepareStatement("SELECT * FROM product");
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
              Product pro = new Product();
              pro.setId(rs.getInt(1));
              pro.setName(rs.getString(2));
              pro.setPrice(rs.getFloat(3));
              pro.setStock(rs.getInt(4));
              pro.setOrigin(rs.getString(5));
              
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
    public boolean doDelete(Product p) {
        DoConnetion dc=new DoConnetion();
        boolean ret = false;
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("DELETE FROM product WHERE id=?");

           // pstmt.setString(1, acc.getAcName());
            //pstmt.setDouble(1, acc.getBalance());
            pstm.setInt(1, p.getId());

            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
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
}
