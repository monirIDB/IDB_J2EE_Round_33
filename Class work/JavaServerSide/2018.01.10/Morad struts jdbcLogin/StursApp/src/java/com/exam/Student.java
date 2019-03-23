/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author l2pc214e
 */
public class Student extends ActionSupport {

    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public Student() {
    }

    public Student(String firstname, String lastname, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String doInsert() throws Exception {

        String url = "jdbc:mysql://localhost:3306/strutsdb";
        String user = "root";
        String pass = "apcl123456";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = conn.prepareStatement("insert into strutstable values(?,?,?,?)");
        pstmt.setString(1, firstname);
        pstmt.setString(2, lastname);
        pstmt.setString(3, username);
        pstmt.setString(4, password);
        int i = pstmt.executeUpdate();

        return "success";
    }

    public String loginAction() throws Exception {
        String url = "jdbc:mysql://localhost:3306/strutsdb";
        String user = "root";
        String pass = "apcl123456";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = conn.prepareStatement("select username,password from strutstable where username=? and password=?");
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return "show";
        } else {
            return "fail";
        }

    }

}
