package com.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {

    public static void main(String[] args) {
        File f1 = new File("myFile.ser");
        try {
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 =(Student)ois.readObject();           
            Student s2 =(Student)ois.readObject();
            Dog s3 =(Dog)ois.readObject();
            
             System.out.println("dog is: "+s3);
            //System.out.println("Student Name is: "+s3.getName());
            //System.out.println("Student Name is: "+s3.getColor());
            //System.out.println("Student Name is: "+s3.spciality());
            
        } catch (IOException ioe) {
            System.out.println("IO Error");
        }catch (ClassNotFoundException cnfe) {
            System.out.println("Class Not Found");
        }

    }
}
