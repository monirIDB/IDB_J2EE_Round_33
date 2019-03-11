
package com.exam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSearializable {
    public static void main(String[] args){
		Student s1=new Student();
		File d1=new File("abc.txt");
         
		try{
                 FileOutputStream f1=new FileOutputStream("abc.txt");
                 ObjectOutputStream oos = new ObjectOutputStream(f1);
                 System.out.println("File save successfuly");
				oos.writeObject(d1);
                oos.flush();
                oos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                
	}
}
