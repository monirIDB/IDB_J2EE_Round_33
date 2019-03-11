
package com.exam;

import java.io.Serializable;
import java.util.Date;


public class Student implements Serializable{
    int id;
    String name;
    String email;
    String contact;
    String gender;
    boolean grad;
    double height;
    Date admit;

    public Student() {
    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Student(int id, String name, String email, String contact, String gender, boolean grad, double height, Date admit) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
        this.grad = grad;
        this.height = height;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isGrad() {
        return grad;
    }

    public void setGrad(boolean grad) {
        this.grad = grad;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getAdmit() {
        return admit;
    }

    public void setAdmit(Date admit) {
        this.admit = admit;
    }
    
}
