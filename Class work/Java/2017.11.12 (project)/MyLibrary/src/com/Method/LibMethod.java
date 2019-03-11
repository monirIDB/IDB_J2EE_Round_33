package com.Method;

import com.LibClass.NewBook;
import com.connection.DoCon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibMethod {

    Connection con;
    PreparedStatement pstm;

    public boolean doSave(NewBook nb) {
        DoCon dc = new DoCon();
        boolean ret = false;

        try {
            con = dc.doCon();
            pstm = con.prepareStatement("INSERT INTO book_info VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setInt(1, nb.getId());
            pstm.setString(2, nb.getName());
            pstm.setString(3, nb.getSubject());
            pstm.setString(4, nb.getEdition());
            pstm.setString(5, nb.getVersion());
            pstm.setString(6, nb.getType());
            pstm.setString(7, nb.getShelf());
            pstm.setString(8, nb.getPublisher());
            pstm.setFloat(9, nb.getPrice());
            java.sql.Date sd = new java.sql.Date(nb.getDate().getTime());
            pstm.setDate(10, sd);
            pstm.setString(11, nb.getSource());
            pstm.setInt(12, nb.getConfidential());
            pstm.setInt(13, nb.getGeneral());
            pstm.setFloat(14, nb.getFee());

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
    public boolean doUpdate(NewBook nb) {
        DoCon dc = new DoCon();
        boolean ret = false;

        try {
            con = dc.doCon();
            pstm = con.prepareStatement("UPDATE book_info SET book_name=?, Subject=?, Edition=?, Version=?, book_type=?, shelf_no=?, publisher=?, book_price=?, purchase_date=?, purchase_source=?, confidential_copies=?, general_copies=?, Issued_fee=? where book_id=?");
           
            pstm.setString(1, nb.getName());
            pstm.setString(2, nb.getSubject());
            pstm.setString(3, nb.getEdition());
            pstm.setString(4, nb.getVersion());
            pstm.setString(5, nb.getType());
            pstm.setString(6, nb.getShelf());
            pstm.setString(7, nb.getPublisher());
            pstm.setFloat(8, nb.getPrice());
            java.sql.Date sd = new java.sql.Date(nb.getDate().getTime());
            pstm.setDate(9, sd);
            pstm.setString(10, nb.getSource());
            pstm.setInt(11, nb.getConfidential());
            pstm.setInt(12, nb.getGeneral());
            pstm.setFloat(13, nb.getFee());
             pstm.setInt(14, nb.getId());

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

    public ArrayList<NewBook> findAllProduct() {
        DoCon dc = new DoCon();
        ArrayList<NewBook> allAcc = new ArrayList<>();
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("SELECT * FROM book_info");
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                NewBook pro = new NewBook();
                pro.setId(rs.getInt(1));

                allAcc.add(pro);

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
        return allAcc;
    }
    public NewBook findProduct(int id){
        //ArrayList<Account> allAcc = new ArrayList<>();
        DoCon dc=new DoCon();
         con = dc.doCon();
         NewBook nb = null;
         
        try {
            pstm = con.prepareStatement("SELECT * FROM book_info WHERE book_id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
            nb = new NewBook();
              nb.setId(rs.getInt(1));
              nb.setName(rs.getString(2));
              nb.setSubject(rs.getString(3));
              nb.setEdition(rs.getString(4));
              nb.setVersion(rs.getString(5));
              nb.setType(rs.getString(6));
              nb.setShelf(rs.getString(7));
              nb.setPublisher(rs.getString(8));
              nb.setPrice(rs.getFloat(9));
              nb.setDate(rs.getDate(10));
              nb.setSource(rs.getString(11));
              nb.setConfidential(rs.getInt(12));
              nb.setGeneral(rs.getInt(13));
              nb.setFee(rs.getFloat(14));
              
              
             
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
        return nb;
    }
}
