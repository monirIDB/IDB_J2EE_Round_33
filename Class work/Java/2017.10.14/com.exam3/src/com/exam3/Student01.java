
package com.exam3;

import java.io.Serializable;


public class Student01 implements Serializable{
    int id;
    String name;
    String email;
    String adderess;

   

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

    public String getAdderess() {
        return adderess;
    }

    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    public Student01(int id, String name, String email, String adderess) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adderess = adderess;
    }

    public Student01() {
    }
     @Override
    public String toString() {
        return "Student01{" + "id=" + id + ", name=" + name + ", email=" + email + ", adderess=" + adderess + '}';
    }
}
