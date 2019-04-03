
package com.exam;


public class Student {
  private int id;
private String name;
private String email;
private String password;
private String mobno;

    public Student() {
    }

    public Student(int id, String name, String email, String password, String mobno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobno = mobno;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
