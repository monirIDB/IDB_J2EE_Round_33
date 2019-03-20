/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author l2pc208e
 */
@ManagedBean
public class product {

    private int id;
    private String name;
    private int stock;
    private double price;
    private double total;

    public product() {
    }

    public product(int id) {
        this.id = id;
    }

    public product(int id, String name, int stock, double price, double total) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Connection con;
    PreparedStatement pstm;

    public void doInsert() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl1234");
            pstm = con.prepareStatement("insert into product values(?,?,?,?,?)");
            pstm.setInt(1, id);
            pstm.setString(2, name);
            pstm.setInt(3, stock);
            pstm.setDouble(4, price);
            pstm.setDouble(5, total);
            int i = pstm.executeUpdate();
            doShow();
        } catch (Exception e) {
        }
    }
    private int selectedId;

    public void doDelete() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl1234");
            pstm = con.prepareStatement("delete from product where id=?");
            pstm.setInt(1, selectedId);
            int i = pstm.executeUpdate();
            doShow();
        } catch (Exception e) {
        }
    }

    public void doUpdate() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl1234");
            pstm = con.prepareStatement("update product set name=?,stock=?,price=?,total=? where id=?");

            pstm.setString(1, name);
            pstm.setInt(2, stock);
            pstm.setDouble(3, price);
            pstm.setDouble(4, total);
            pstm.setInt(5, selectedId);
            int i = pstm.executeUpdate();
            doShow();
        } catch (Exception e) {
        }
    }

    public ArrayList<Integer> getIdload() {
        ArrayList<Integer> idList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl1234");
            pstm = con.prepareStatement("select * from product");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                product p = new product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
                idList.add(p.getId());
            }
        } catch (Exception e) {
        }
        return idList;
    }

    public void ajaxlist() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl1234");
            pstm = con.prepareStatement("select * from product where id=?");
            pstm.setInt(1, selectedId);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                setId(rs.getInt(1));
                setName(rs.getString(2));
                setStock(rs.getInt(3));
                setPrice(rs.getDouble(4));
                setTotal(rs.getDouble(5)); 
            }
            }catch (Exception e) {
       }
        }
    
    private ArrayList<product> pro = new ArrayList<>();

    public void doShow() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl1234");
            pstm = con.prepareCall("select * from product");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                product p = new product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
                pro.add(p);

            }
        } catch (Exception e) {
        }
    }

    public ArrayList<product> getPro() {
        return pro;
    }

    public void setPro(ArrayList<product> pro) {
        this.pro = pro;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }
}
