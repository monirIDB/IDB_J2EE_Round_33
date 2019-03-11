
package com.pojo;


public class Product {
    private int pid;
    private String pname;
    private double uprice;
    private int stock;
    private String origin;

    public Product() {
    }

    public Product(int pid) {
        this.pid = pid;
    }

    public Product(int pid, String pname, double uprice, int stock, String origin) {
        this.pid = pid;
        this.pname = pname;
        this.uprice = uprice;
        this.stock = stock;
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    public double getUprice() {
        return uprice;
    }

    public void setUprice(double uprice) {
        this.uprice = uprice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
