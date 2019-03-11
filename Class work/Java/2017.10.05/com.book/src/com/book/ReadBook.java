
package com.book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadBook {
    public static void main(String[] args) {
        String f=new String("BookInfo.txt");
        File f1=new File(f);
        try{
        FileInputStream fs=new FileInputStream(f1);
        ObjectInputStream os=new ObjectInputStream(fs);
        Book s1=(Book) os.readObject();
        System.out.print("Book ID: "+s1.getId()+" Book Name: "+s1.getName()+" Book Name: "+s1.getPrise());
        }catch(IOException ioe){
            ioe.printStackTrace();
        }catch(ClassNotFoundException cnfe){
            System.out.println("Class not found");
        }
    }
}
