package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Student implements java.io.Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String stock;
    private String date;
    private String uprice;
    private String totoaprice;

    public Student() {
    }

    public Student(String name, String stock, String date, String uprice, String totoaprice) {
        this.name = name;
        this.stock = stock;
        this.date = date;
        this.uprice = uprice;
        this.totoaprice = totoaprice;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStock() {
        return this.stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUprice() {
        return this.uprice;
    }

    public void setUprice(String uprice) {
        this.uprice = uprice;
    }

    public String getTotoaprice() {
        return this.totoaprice;
    }

    public void setTotoaprice(String totoaprice) {
        this.totoaprice = totoaprice;
    }

}
