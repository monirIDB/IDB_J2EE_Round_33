package com.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped

public class Product {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    private int pid;
    private String pname;
    private double price;
    private double stock;
    private double totalPrice;
    private int selectedId;
    
    private List<Product> proList=new ArrayList<>();

    public Product() {
    }

    public Product(int pid, String pname, double price, double stock, double totalPrice) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.stock = stock;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void doInsert() {
        try {
            ConnectDb cd = new ConnectDb();
            con = cd.doConnect();
            pstm = con.prepareStatement("insert into product values(?,?,?,?,?)");
            pstm.setInt(1, pid);
            pstm.setString(2, pname);
            pstm.setDouble(3, price);
            pstm.setDouble(4, stock);
            pstm.setDouble(5, totalPrice);
            int i = pstm.executeUpdate();
            doShow();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doUpdate() {
        try {
            ConnectDb cd = new ConnectDb();
            con = cd.doConnect();
            pstm = con.prepareStatement("update product set pname=?,price=?,stock=?,totalPrice=? where pid=?");
            pstm.setString(1, pname);
            pstm.setDouble(2, price);
            pstm.setDouble(3, stock);
            pstm.setDouble(4, totalPrice);
            pstm.setInt(5, selectedId);
            int i = pstm.executeUpdate();
            doShow();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doDelete() {
        try {
            ConnectDb cd = new ConnectDb();
            con = cd.doConnect();
            pstm = con.prepareStatement("delete from product where pid=?");
            pstm.setInt(1, selectedId);
            int i = pstm.executeUpdate();
            doShow();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Product> doShow() {
        try {
            ConnectDb cd = new ConnectDb();
            con = cd.doConnect();
            pstm = con.prepareStatement("select * from product");
            rs=pstm.executeQuery();
            proList.clear();
            while (rs.next()) {                
                Product p=new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5));
                proList.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return proList;
    }
    
    public void ajaxList() {
        try {
            ConnectDb cd = new ConnectDb();
            con = cd.doConnect();
            pstm = con.prepareStatement("select * from product where pid=?");
            pstm.setInt(1, selectedId);
            rs=pstm.executeQuery();
            while (rs.next()) {                
                setPid(rs.getInt(1));
                setPname(rs.getString(2));
                setPrice(rs.getDouble(3));
                setStock(rs.getDouble(4));
                setTotalPrice(rs.getDouble(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Integer> getDoLoad() {
        List<Integer> proLoad=new ArrayList<>();
        try {
            ConnectDb cd = new ConnectDb();
            con = cd.doConnect();
            pstm = con.prepareStatement("select * from product");
            rs=pstm.executeQuery();
            while (rs.next()) {                
               Product p =new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5));
               proLoad.add(p.getPid());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proLoad;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public List<Product> getProList() {
        return proList;
    }

    public void setProList(List<Product> proList) {
        this.proList = proList;
    }
}
