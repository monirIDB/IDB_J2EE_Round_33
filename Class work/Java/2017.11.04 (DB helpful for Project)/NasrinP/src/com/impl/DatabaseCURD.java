package com.impl;

import com.pojo.Product;
import com.util.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseCURD {

    Connection con;
    PreparedStatement pstm;

    public boolean doInsert(Product p) {
        ConnectDB cd = new ConnectDB();
        boolean ret = false;
        try {
            con = cd.doConnect();
            String st = "INSERT INTO product(pid,pname,uprice,stock,origin) VALUES(?,?,?,?,?)";
            pstm = con.prepareStatement(st);
            pstm.setInt(1, p.getPid());
            pstm.setString(2, p.getPname());
            pstm.setDouble(3, p.getUprice());
            pstm.setInt(4, p.getStock());
            pstm.setString(5, p.getOrigin());
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        return ret;
    }

    public boolean doUpdate(Product p) {
        ConnectDB cd = new ConnectDB();
        boolean ret = false;
        try {
            con = cd.doConnect();
            String st = "UPDATE product SET pname=?,uprice=?,stock=?,origin=? WHERE pid=?";
            pstm = con.prepareStatement(st);

            pstm.setString(1, p.getPname());
            pstm.setDouble(2, p.getUprice());
            pstm.setInt(3, p.getStock());
            pstm.setString(4, p.getOrigin());
            pstm.setInt(5, p.getPid());
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        return ret;
    }

    public boolean doDelete(Product p) {
        ConnectDB cd = new ConnectDB();
        boolean ret = false;
        try {
            con = cd.doConnect();
            String st = "DELETE FROM product WHERE pid=?";
            pstm = con.prepareStatement(st);

//            pstm.setString(1, p.getPname());
//            pstm.setDouble(2, p.getUprice());
//            pstm.setInt(3, p.getStock());
//            pstm.setString(4, p.getOrigin());
            pstm.setInt(1, p.getPid());
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

        return ret;
    }

    public ArrayList<Product> findAllProduct() {
        ConnectDB cd = new ConnectDB();
        ArrayList<Product> allPro = new ArrayList<>();
        try {
            con = cd.doConnect();
            String st = "SELECT * FROM product ";
            pstm = con.prepareStatement(st);
            ResultSet rs = pstm.executeQuery();
            Product p = new Product();
            while (rs.next()) {
                p = new Product();
                p.setPid(rs.getInt(1));
                p.setPname(rs.getString(2));
                p.setUprice(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setOrigin(rs.getString(5));
                allPro.add(p);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        return allPro;

    }

    public Product findProductById(int id) {
        ConnectDB cd = new ConnectDB();
        Product p = null;
        try {
            con = cd.doConnect();
            String st = "SELECT * FROM product WHERE pid=?";
            pstm = con.prepareStatement(st);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                p = new Product();
                p.setPid(rs.getInt(1));
                p.setPname(rs.getString(2));
                p.setUprice(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setOrigin(rs.getString(5));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        return p;

    }
}
