
package com.ProDB;


public class Product {
    int id;
    String name;
    float price;
    int stock;
    String origin;

    public Product() {
    }

    public Product(int id, int stock) {
        this.id = id;
        this.stock = stock;
    }

    public Product(int id, String name, float price, int stock, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.origin = origin;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
