
package com.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class WriteAccFile {
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
       WriteAccFile waf=new WriteAccFile();
       waf.doSave(ac);
       
    }
    private void doSave(Account x){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/dbacc";
        String user="root";
        String password="apcl123456";
        Connection con=DriverManager.getConnection(url, user, password);
        String st="insert into account(AccountNumber,AccountType,OwnerName,Address,NomineeName,MoneyAmmount)values(?,?,?,?,?,?);";
            PreparedStatement pstm=con.prepareStatement(st);
            
            pstm.setInt(1, x.getAccNumber());
            pstm.setString(2, x.getAccType());
            pstm.setString(3, x.getOwnerName());
            pstm.setString(4, x.getAddress());
            pstm.setString(5, x.getnName());
            pstm.setDouble(6, x.getMonAmount());
            
            int i=pstm.executeUpdate();
            
        }catch(Exception e){
            System.out.println("Exception error");
        }
    }
}
