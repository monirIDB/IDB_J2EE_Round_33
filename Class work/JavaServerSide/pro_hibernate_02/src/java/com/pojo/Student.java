package com.pojo;
// Generated Jan 16, 2018 6:45:26 PM by Hibernate Tools 4.3.1

import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student implements java.io.Serializable {

    private int id;
    private String name;
    private String email;
    private String birthdate;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, String email, String birthdate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
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

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void doSave() {
        StudentDAO dao = new StudentDAO();
        dao.doInsert(this);
    }

    List getAllStudent;

    public List getGetAllStudent() {
        StudentDAO dao = new StudentDAO();
        getAllStudent = dao.showAllStudent();
        return getAllStudent;

    }

    public void setGetAllStudent(List getAllStudent) {
        this.getAllStudent = getAllStudent;
    }

}
