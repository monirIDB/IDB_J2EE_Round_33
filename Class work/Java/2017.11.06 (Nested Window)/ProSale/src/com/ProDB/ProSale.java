
package com.ProDB;


public class ProSale {
   int sid;
   int pid;
   String pname;
   int stock;
  float price;
   int quantity;
   float total;

    public ProSale() {
    }

    public ProSale(int sid, int pid, String pname, int stock, float price, int quantity, float total) {
        this.sid = sid;
        this.pid = pid;
        this.pname = pname;
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public ProSale(int sid, int pid, String pname, float price, int quantity, float total) {
        this.sid = sid;
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
