package com.exam;
import java.io.Serializable;
import java.util.Date;
public class Student implements Serializable{
    private int id;
    private String name;
    private String email;
    private String contact;
    private String gen;
    private boolean graduation;
    private double height;
    private Date admit;

    public Student() {
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Student(int id, String name, String email, String contact, String gen, boolean graduation, double height, Date admit) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.gen = gen;
        this.graduation = graduation;
        this.height = height;
        this.admit = admit;
    }

    public Date getAdmit() {
        return admit;
    }

    public void setAdmit(Date admit) {
        this.admit = admit;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public boolean isGraduation() {
        return graduation;
    }

    public void setGraduation(boolean graduation) {
        this.graduation = graduation;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
