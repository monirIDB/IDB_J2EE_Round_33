
package com.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AccountUpdate {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter account no");
            int a=sc2.nextInt();
            
            System.out.println("Eneter account type");
            String b=sc.nextLine();
            System.out.println("Enter accounet owner name");
            String c=sc.nextLine();
            System.out.println("Enter owner address");
            String d=sc.nextLine();
            System.out.println("Enter account nominee name");
            String e=sc.nextLine();
            System.out.println("Enter ammount of money in account");
            Double f=sc.nextDouble();
            
        Account ac=new Account(a,b,c,d,e,f);
        
       AccountUpdate au=new AccountUpdate();
       au.doUpdate(ac);
       
    }
    private void doUpdate(Account x){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/dbacc";
        String user="root";
        String password="apcl123456";
        Connection con=DriverManager.getConnection(url, user, password);
        String st="update account set AccountType=?,OwnerName=?,Address=?,NomineeName=?,MoneyAmmount=? where AccountNumber=?";
            PreparedStatement pstm=con.prepareStatement(st);
            
         ;
            pstm.setString(1, x.getAccType());
            pstm.setString(2, x.getOwnerName());
            pstm.setString(3, x.getAddress());
            pstm.setString(4, x.getnName());
            pstm.setDouble(5, x.getMonAmount());
            pstm.setInt(6, x.getAccNumber());
            
            int i=pstm.executeUpdate();
            
        }catch(Exception e){
            System.out.println("Exception error");
    }
 }
}
