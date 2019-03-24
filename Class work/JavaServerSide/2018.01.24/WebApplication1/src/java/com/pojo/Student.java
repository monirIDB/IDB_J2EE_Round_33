package com.pojo;
// Generated Feb 1, 2018 4:22:53 PM by Hibernate Tools 4.3.1

import com.Dao.StuDAO;
import javax.faces.bean.ManagedBean;




/**
 * Student generated by hbm2java
 */
@ManagedBean (name="st")
public class Student  implements java.io.Serializable {


     private int id;
     private String name;
     private String user;
     private String pass;

    public Student() {
    }

	
    public Student(int id) {
        this.id = id;
    }
    public Student(int id, String name, String user, String pass) {
       this.id = id;
       this.name = name;
       this.user = user;
       this.pass = pass;
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
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

public void doSave(){
    StuDAO sd = new StuDAO();
    sd.doAdd(this);
}
public String doShow(){
    String ret="fail";
    StuDAO s=new StuDAO();
    if (s.findStudent(user,pass)!=null) {
        ret="ok";
    }else{
        
        ret="fail";
    }
    return ret;

}
}


