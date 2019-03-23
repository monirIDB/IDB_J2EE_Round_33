package com.pojo;

import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Studant  implements java.io.Serializable {


     private int id;
     private String name;
     private String email;
     private String birthdate;

    public Studant() {
    }

	
    public Studant(int id) {
        this.id = id;
    }
    public Studant(int id, String name, String email, String birthdate) {
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
        StudantDAO st=new StudantDAO();
        st.doAdd(this);
    }
  public void doUpdate() {
        StudantDAO sd = new StudantDAO();
        sd.doUp(this);
    }
   public void findaStudant() {
        StudantDAO sd = new StudantDAO();
        Studant s=sd.aStudant(id);
        this.id=s.id;
        this.name=s.name;
        this.email=s.email;
        this.birthdate=s.birthdate;
    }
  public void doDelete() {
        StudantDAO sd = new StudantDAO();
        sd.doDel(this);
    }
  
List <Studant> allStudantFromDb;

    public List<Studant> getAllStudantFromDb() {
       StudantDAO sd = new StudantDAO();
         allStudantFromDb=sd.showAllStudant();
        return allStudantFromDb;
    }

    public void setAllStudantFromDb(List<Studant> allStudantFromDb) {
        this.allStudantFromDb = allStudantFromDb;
    }
private List<Integer> showAllId;
    public List<Integer> getShowAllId() {
        StudantDAO sd = new StudantDAO();
        showAllId = sd.allId();
        return showAllId;
    }

    public void setShowAllId(List<Integer> showAllId) {
        this.showAllId = showAllId;
    }


}


