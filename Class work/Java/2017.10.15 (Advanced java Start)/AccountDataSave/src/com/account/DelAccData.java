
package com.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DelAccData {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter account no");
            int a=sc2.nextInt();
          
            
        Account ac=new Account(a);
       DelAccData dad=new DelAccData();
       dad.doDel(ac);
       
    }
    private void doDel(Account x){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/dbacc";
        String user="root";
        String password="apcl123456";
        Connection con=DriverManager.getConnection(url, user, password);
        String st="delete from account where AccountNumber=?";
            PreparedStatement pstm=con.prepareStatement(st);
            
            pstm.setInt(1, x.getAccNumber());
           
            int i=pstm.executeUpdate();
            
        }catch(Exception e){
            System.out.println("Exception error");
    }
        
}
}
