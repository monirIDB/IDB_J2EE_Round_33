package com.pojo;
// Generated Feb 12, 2018 3:55:55 PM by Hibernate Tools 4.3.1

import com.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class User extends ActionSupport implements java.io.Serializable {

    private int id;
    private String name;
    private String email;
    private String password;
    private String mobno;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String email, String password, String mobno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobno = mobno;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobno() {
        return this.mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public void doInsert() {
        UserDAO ud = new UserDAO();
        ud.doSave(this);
    }

    public String doLog() {
        UserDAO ud = new UserDAO();
        String ret = "error";
        if (ud.aUser(id, password) != null) {
            ret = SUCCESS;
        } else {
            ret = "error";
        }
        return ret;
    }

    @Override
    public String execute() {
        doInsert();
        return SUCCESS;
    }

//    public String m1() {
//        doLog();
//        return SUCCESS;
//    }

}
