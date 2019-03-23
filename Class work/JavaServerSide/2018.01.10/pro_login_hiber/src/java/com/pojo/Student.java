package com.pojo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student implements java.io.Serializable {

    private int id;
    private String name;
    private String password;

    public String doInsert() {
        String ret = "fail";
        StudentDAO lo = new StudentDAO();
        if (lo.doAdd(this)) {
            ret = "success";
        } else {

            ret = "fail";
        }
        return ret;
    }

    public String doShow1() {
        String ret = "fail";
        StudentDAO lo = new StudentDAO();
        if (lo.aUser(id, password) != null) {
            ret = "success";
        } else {

            ret = "fail";
        }
        return ret;
    }

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
