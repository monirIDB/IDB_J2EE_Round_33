
package com.exam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;


public class WriterObject {
    public static void main(String[] args){
        Student fatema=new Student(101, "Fatema", "fatema@gmail.com", "01681146198","Female",true,5.2, new Date(12-05-2017));
        Student nasrin=new Student(102, "Fatema", "fatema@gmail.com", "01681146198","Female",true,5.2, new Date(12-05-2017));
        Student rahim=new Student(103, "Fatema", "fatema@gmail.com", "01681146198","Female",true,5.2, new Date(12-05-2017));
        Student sibli=new Student(104, "Fatema", "fatema@gmail.com", "01681146198","Female",true,5.2, new Date(12-05-2017));
        Student zaman=new Student(105, "Fatema", "fatema@gmail.com", "01681146198","Female",true,5.2, new Date(12-05-2017));
        Dog d1=new Dog("Red","Tom","Cake");
        try{
            String path=new String("myFile.ser");
            File file=new File(path);
            FileOutputStream fos =new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(fatema);
            oos.writeObject(nasrin);
            oos.writeObject(d1);
            System.out.println("File Created");
            oos.flush();
            oos.close();
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
