
package mamun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class WriteBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN Number");
        int a = sc.nextInt();
        System.out.println("Enter the Author Name");
        String b = sc.next();
        Book b1 = new Book(a,b);
        try{
         File f1 = new File("myFile.ser");
         FileOutputStream fos = new FileOutputStream(f1);
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(b1);
         System.out.println("successfully created");
         oos.flush();
         oos.close();
        }catch(IOException ioe){
        ioe.printStackTrace();
    }
    }
}
