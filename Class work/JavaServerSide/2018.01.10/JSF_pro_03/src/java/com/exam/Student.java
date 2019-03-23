
package com.exam;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "stud")
public class Student {
    int id;
    String name;
    String email;
    String round;
    String selectedRound;
    ArrayList<String> selectMany= new ArrayList<>();
    ArrayList<String> itemList= new ArrayList<>();
      String a="r 33";
      String b="r 34";
      

    public Student() {
    }

    public Student(int id, String name, String email, String round) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.round = round;
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

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getSelectedRound() {
        return selectedRound;
    }

    public void setSelectedRound(String selectedRound) {
        this.selectedRound = selectedRound;
    }

    public ArrayList<String> getSelectMany() {
        return selectMany;
    }

    public void setSelectMany(ArrayList<String> selectMany) {
        this.selectMany = selectMany;
       
    }

    public ArrayList<String> getItemList() {
        itemList.add(a);
        itemList.add("fguyhgfyh");
        itemList.add(b);
        return itemList;
        
    }

    public void setItemList(ArrayList<String> itemList) {
        this.itemList = itemList;
         itemList.add(a);
        itemList.add(b);
    }
    
    
    
}
