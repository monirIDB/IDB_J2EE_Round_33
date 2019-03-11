
package com.exam3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class SRead {
    public static void main(String[] args) {
        String path= "myfile.ser";
        File f1= new File(path);
        try {
            FileInputStream fis=new FileInputStream(f1);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student01 s1=(Student01)ois.readObject();
            System.out.println(s1);
            
        } catch (IOException e) {
        }catch(ClassNotFoundException cnfe){
        
        }
    }
}
