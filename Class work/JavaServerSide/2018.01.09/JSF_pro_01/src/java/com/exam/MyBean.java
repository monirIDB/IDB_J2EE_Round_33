
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class MyBean {
    int id=24;
    String name="Monir";
    String status;
    
    public MyBean() {
    }

    public MyBean(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String m1(){
        return "monir";
    }
    public String m2(){
    if(id%2==0){
        status="even";
       
    }else{
        status="odd";
        
    }
        return "monir";
    }
    public boolean doInsert(int x, String y){
        boolean ret=false;
        
        String url="jdbc:mysql://localhost:3306/login_db";
       String user="root";
       String pass="apcl123456";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url, user, pass);
            PreparedStatement pstm= con.prepareStatement("INSERT INTO jsf_table values(?,?)");
            pstm.setInt(1, x);
            pstm.setString(2, y);
            int i=pstm.executeUpdate();
            if(i>0){
                ret=true;
            }else{
                ret=false;
            }
        } catch (Exception e) {
        }
        return ret;
    }
    
    public String m3(){
        boolean b=doInsert(id,name);
        if(b){
            return "monir";
        }else{
            return "fail";
        }
    }
    
}
