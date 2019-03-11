
package com.exam;


public class Book {
   private int id;
   private String name;
   private String auther;
   private float prise;
   private String p_date;

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

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public float getPrise() {
        return prise;
    }

    public void setPrise(float prise) {
        this.prise = prise;
    }

    public String getP_date() {
        return p_date;
    }

    public void setP_date(String p_date) {
        this.p_date = p_date;
    }

    public Book(int id, String name, String auther, float prise, String p_date) {
        this.id = id;
        this.name = name;
        this.auther = auther;
        this.prise = prise;
        this.p_date = p_date;
    }

    public Book() {
    }

   
   
}
