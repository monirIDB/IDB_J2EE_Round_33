package com.struts;


import com.opensymphony.xwork2.ActionSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l2pc208e
 */
public class LoginClass extends ActionSupport{
    private String name;
    private int age;
    public String execute() throws Exception {
       
      return "success";
   }
    public void validate() {
      if (name == null || name.trim().equals("")) {
         addFieldError("name","The name is required");
      }
      
      if (age < 28 || age > 65) {
         addFieldError("age","Age must be in between 28 and 65");
      }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
