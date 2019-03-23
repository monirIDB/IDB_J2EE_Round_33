package com.pojo;
// Generated Jan 18, 2018 3:05:10 PM by Hibernate Tools 4.3.1

import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 * Product02 generated by hbm2java
 */
@ManagedBean
public class Product02  implements java.io.Serializable {


     private int id;
     private String name;
     private Integer price;
     private Integer stock;
     private Integer totalPrice;

    public Product02() {
    }

	
    public Product02(int id) {
        this.id = id;
    }
    public Product02(int id, String name, Integer price, Integer stock, Integer totalPrice) {
       this.id = id;
       this.name = name;
       this.price = price;
       this.stock = stock;
       this.totalPrice = totalPrice;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

public void doSave(){
    ProductDAO da=new ProductDAO();
    da.doInsert(this);
}
List<Product02> showAllPro;

    public List<Product02> getShowAllPro() {
         ProductDAO da=new ProductDAO();
        showAllPro= da.showAllProduct();
        return showAllPro;
    }

    public void setShowAllPro(List<Product02> showAllPro) {
        this.showAllPro = showAllPro;
    }

}


