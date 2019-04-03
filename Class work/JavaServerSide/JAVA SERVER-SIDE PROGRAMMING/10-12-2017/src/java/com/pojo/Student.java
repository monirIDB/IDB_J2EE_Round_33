package com.pojo;

public class Student {

    private int id;
    private String name;
    private String pass;
    private String email;
    private String gender;

    public Student() {
    }

    public Student(int id, String name, String pass, String email, String gender) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
