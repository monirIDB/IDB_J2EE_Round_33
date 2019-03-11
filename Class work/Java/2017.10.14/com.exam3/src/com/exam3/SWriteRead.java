
package com.exam3;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SWriteRead {
    public static void main(String[] args) {
        Student01 rahim=new Student01(101,"Rahim","rahim@gmail.com","Dhaka");
        String path="myFile.ser";
        File f=new File(path);
        try {
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(rahim);
            System.out.println("File Saved");
            oos.flush();
            oos.close();
             
            /*FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student01 s1=(Student01) ois.readObject();
            System.out.println(s1);*/
             
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
