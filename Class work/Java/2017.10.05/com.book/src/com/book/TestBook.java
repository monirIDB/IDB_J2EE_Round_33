
package com.book;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;


public class TestBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book ID");
        int id=sc.nextInt();
        System.out.println("Enter Book NCTB ID");
        int nctbId=sc.nextInt();
        System.out.println("Enter Book Prise");
        double prise=sc.nextDouble();
        System.out.println("Enter Book Adition");
        String adition=sc.next();
        System.out.println("Enter Book Name");
        String name=sc.next();
        System.out.println("Enter Book Auther Name");
        String authrName=sc.next();
        System.out.println("Enter Book Writer Name");
        String writerName=sc.next();
        System.out.println("Enter Book Publishing Company");
        String publisher=sc.next();
        System.out.println("Enter Book Publishing Date");
        String publishingDate=sc.next();
        System.out.println("Enter Book Page Number");
        int pageNum=sc.nextInt();
        Book bk=new Book(id,nctbId,prise,adition,name,authrName,writerName,publisher,publishingDate,pageNum);
        String fileLocation=new String("BookInfo.txt");
        File f1=new File(fileLocation);
        try{
            FileOutputStream fs=new FileOutputStream(f1);
            ObjectOutputStream os= new ObjectOutputStream(fs);
            System.out.println("File Created");
            os.writeObject(bk);
            os.flush();
            os.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }
    
}
