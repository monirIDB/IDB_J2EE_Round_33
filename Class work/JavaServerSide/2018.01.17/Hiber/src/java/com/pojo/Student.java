package com.pojo;

import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Query;

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

    public void doInsert() {
        StudentDAO sd = new StudentDAO();
        sd.doAdd(this);
    }
    
      public void doDelete() {
        StudentDAO sd = new StudentDAO();
        sd.doAdd(this);
    }
      
        public void doUpdate() {
        StudentDAO sd = new StudentDAO();
        sd.doAdd(this);
    }
    private List <Student> allStudentFromDb;

    public List <Student> getAllStudentFromDb() {
         StudentDAO sd = new StudentDAO();
         allStudentFromDb=sd.showAllStudent();
        return allStudentFromDb;
    }

    public void setAllStudentFromDb(List <Student> allStudentFromDb) {
        this.allStudentFromDb = allStudentFromDb;
    }
    
    private List<Integer> showAllId;

    public List<Integer> getShowAllId() {
        StudentDAO sd = new StudentDAO();
        showAllId = sd.allId();
        return showAllId;
    }

    public void setShowAllId(List<Integer> showAllId) {
        this.showAllId = showAllId;
    }

    public void findaStudent() {
        StudentDAO sd = new StudentDAO();
        Student s=sd.aStudent(id);
        this.id=s.id;
        this.name=s.name;
        this.email=s.email;
        this.birthdate=s.birthdate;
    }
}
