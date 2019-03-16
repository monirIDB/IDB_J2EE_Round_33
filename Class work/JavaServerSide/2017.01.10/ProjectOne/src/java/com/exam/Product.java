/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author l2pc208e
 */
@ManagedBean
public class Product {

    DBConnect dc = new DBConnect();
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    private int id;
    private String name;
    private int stock;
    private double price;
    private double total;

    private List<Product> pList = new ArrayList<>();

    private int selectedId;

    public Product() {
    }

    public Product(int id, String name, int stock, double price, double total) {

        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void doSave() {
        con = dc.doCon();
        try {
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

    public void doChange() {
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("update product set name=?,stock=?,price=?, total=? where id=?");

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
    public void doRemove() {
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("delete from product where id=?");

            
            pstm.setInt(1, selectedId);

            int i = pstm.executeUpdate();
            doShow();
        } catch (Exception e) {
        }

    }

    public List<Product> doShow() {
        pList = new ArrayList<>();
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("select * from product");
            rs = pstm.executeQuery();
            pList.clear();
            while (rs.next()) {
                Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
                pList.add(pro);
            }
        } catch (Exception e) {
        }
        return pList;
    }
    public List<Integer> getIdList() {
      List<Integer> pId = new ArrayList<>();
        con = dc.doCon();
        try {
            pstm = con.prepareStatement("select * from product");
            rs = pstm.executeQuery();
            pList.clear();
            while (rs.next()) {
                Product pro = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
                pId.add(pro.getId());
            }
        } catch (Exception e) {
        }
        return pId;
    }

    public List<Product> getpList() {
        return pList;
    }

    public void setpList(List<Product> pList) {
        this.pList = pList;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public void ajaxList() {

        con = dc.doCon();
        try {
            pstm = con.prepareStatement("select * from product where id=?");
            pstm.setInt(1, selectedId);
            rs = pstm.executeQuery();

            while (rs.next()) {
                setId(rs.getInt(1));
                setName(rs.getString(2));
                setStock(rs.getInt(3));
                setPrice(rs.getDouble(4));
                setTotal(rs.getDouble(5));
            }
        } catch (Exception e) {
        }

    }
}
