
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Student stud=new Student();
       stud.toSave();
    }
    
    public void toSave(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mySql://localhost:3306/db2";
            String user="root";
            String pass="apcl123456";
            Connection con=DriverManager.getConnection(url,user,pass);
            String st="insert into student(id,name,email,date,gpa) values(?,?,?,?,?)";
            PreparedStatement pstm1=con.prepareStatement(st);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter ID");
            int a=sc.nextInt();
            System.out.println("Enter Name");
            String b=sc.next();
            System.out.println("Enter Email");
            String c=sc.next();
            System.out.println("Enter Date");
            String d=sc.next();
            System.out.println("Enter GPA");
            float e=sc.nextFloat();
            
            
            
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
            Date d1=sdf.parse(d);
            Calendar cal=Calendar.getInstance();
            cal.setTime(d1);
            Date d11=cal.getTime();
            java.sql.Date sqlDate = new java.sql.Date(d11.getTime());
            
            //java.sql.Date da=new java.sql.Date(dat);
            //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
            //Date date = format.parse(d);
            
            pstm1.setInt(1,a);
            pstm1.setString(2, b);
            pstm1.setString(3, c);
           
            
            
            //cal.set(date1);
            //Date sDate=cal.getTime();
            
            //java.sql.Date dt=new java.sql.Date(sDate.getTime());
            
            pstm1.setDate(4, sqlDate);
            pstm1.setFloat(5, e);
            int i1=pstm1.executeUpdate();
            if(i1>0){
                System.out.println("Insert succesfull");
            }else{
                System.out.println("Inserte failed");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
