
package com.LibClass;

import java.util.Date;


public class NewUser {
    int no;
    String id;
    String pass;
    String name;
    String email;
    String mobile;
    String religion;
    String sex;
    String proffesion;
    Date date;
    int age;
    String photo;
    String address;

    public NewUser() {
    }

    public NewUser(int no, String id, String pass, String name, String email, String mobile, String religion, String sex, String proffesion, Date date, int age, String photo, String address) {
        this.no = no;
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.religion = religion;
        this.sex = sex;
        this.proffesion = proffesion;
        this.date = date;
        this.age = age;
        this.photo = photo;
        this.address = address;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
