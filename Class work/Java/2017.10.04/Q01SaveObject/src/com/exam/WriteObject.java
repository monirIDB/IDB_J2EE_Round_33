package com.exam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class WriteObject {

    public static void main(String[] args) {
        Student fatema = new Student(101, "Fatema", "fatema@google.com", "+8801234571", "female", true, 5.5, new Date(1999, 12, 20));
        Student nasrin = new Student(102, "Nasrin", "nasrin@google.com", "+8801234572", "female", true, 5.5, new Date(1999, 12, 21));
        Student sharmin = new Student(103, "Sharmin", "sharmin@google.com", "+8801234573", "female", true, 5.5, new Date(1999, 12, 22));
        Student anamul = new Student(104, "Anamul", "anamul@google.com", "+8801234574", "male", true, 5.5, new Date(1999, 12, 23));
        Student mamun = new Student(105, "Mamun", "mamun@google.com", "+8801234575", "male", true, 5.5, new Date(1999, 12, 24));
        Dog d1 = new Dog("tom", "brown", "meat");
        Dog m1 = new Dog("moti", "yellow", "bisciut");
        Dog j1 = new Dog("joni", "white", "bread");
        
        try {
            String path = new String("myfile.ser");
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fatema);
            oos.writeObject(nasrin);
            oos.writeObject(d1);
            
            System.out.println("object saved");
            oos.flush();
            oos.close();
        } catch (IOException ioe) {
           ioe.printStackTrace();
        }

    }
}
