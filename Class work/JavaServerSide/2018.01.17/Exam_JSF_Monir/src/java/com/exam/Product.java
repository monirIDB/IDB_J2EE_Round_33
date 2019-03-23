
package com.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Product {
    private int id;
    private String name;
    private int price;
    private int stock;
    private int total;
    
    DoCon dc = new DoCon();
    List<Product> stList= new ArrayList<>();
    private int selectedID;

    public Product() {
    }

    public Product(int id, String name, int price, int stock, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Product> getStList() {
        return stList;
    }

    public void setStList(List<Product> stList) {
        this.stList = stList;
    }
    
    
   
     public void doInsert() {
         Connection con = dc.doConnection();
        try {
            

            String ss = "INSERT INTO product values (?,?,?,?,?)";

            PreparedStatement psment = con.prepareStatement(ss);
            psment.setInt(1, id);
            psment.setString(2, name);
            psment.setInt(3, price);
            psment.setInt(4, stock);
             psment.setInt(5, total);
            int n = psment.executeUpdate();
            doShow();//doShow Data on Display Page
        } catch (Exception e) {
        }
    }
     
     public void doShow() {
        try {
            Connection con = dc.doConnection();

            String ss = "SELECT * FROM product";

            PreparedStatement psment = con.prepareStatement(ss);

            ResultSet rs = psment.executeQuery();

            while (rs.next()) {
                Product p= new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                stList.add(p);
            }
        } catch (Exception e) {
        }
    }
      public void doUpdate() {
        try {
           Connection con = dc.doConnection();
            String ss = "update product set name = ? , price = ?, stock=?, Total_price=? where id = ?";
            PreparedStatement psment = con.prepareStatement(ss);
           
            psment.setString(1, name);
            psment.setInt(2, price);
            psment.setInt(3, stock);
             psment.setInt(4, total);
             psment.setInt(5, selectedID);
            int n = psment.executeUpdate();
            doShow(); //doShow data on display page
        } catch (Exception e) {

        }
    }
       public void doDelete() {
        try {
             Connection con = dc.doConnection();
            String ss = "delete from product where id = ?";
            PreparedStatement psment = con.prepareStatement(ss);
            psment.setInt(1, selectedID);
            int n = psment.executeUpdate();
            doShow(); //doShow data on display page
        } catch (Exception e) {

        }
    }
      
      public void ajaxList() {
        try {
           Connection con = dc.doConnection();

            String ss = "select * from product where id = ?";

            PreparedStatement psment = con.prepareStatement(ss);

            psment.setInt(1, selectedID);

            ResultSet rs = psment.executeQuery();

            while (rs.next()) {
                setId(rs.getInt(1));
                setName(rs.getString(2));
                setPrice(rs.getInt(3));
                setStock(rs.getInt(4));
                setTotal(rs.getInt(5));
            }
        } catch (Exception e) {
        }
    }
      public List<Integer> getIdLoad() {
        List<Integer> idList = new ArrayList<Integer>();
        try {
            Connection con = dc.doConnection();

            String ss = "select * from product";

            PreparedStatement psment = con.prepareStatement(ss);

            ResultSet rs = psment.executeQuery();

            while (rs.next()) {
                Product s = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                idList.add(s.getId());
            }
        } catch (Exception e) {
        }
        return idList;
    }

    public int getSelectedID() {
        return selectedID;
    }

    public void setSelectedID(int selectedID) {
        this.selectedID = selectedID;
    }
}
