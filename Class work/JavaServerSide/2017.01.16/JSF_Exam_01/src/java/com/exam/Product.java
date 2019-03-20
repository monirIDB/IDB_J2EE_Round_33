
package com.exam;

import java.sql.Connection;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Product {
    int id;
    String name;
    int price;
    int stock;
    int total;
    DoConnection dc=new DoConnection();

    public Product() {
    }

    public Product(int id, String name, int price, int stock, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void doSave(){
        Connection con=dc.doCon();
        String ss="INSERT INTO product_01 values(?,?,?,?,?)";
        //PreparedStatment pstm;
      
    }
}
