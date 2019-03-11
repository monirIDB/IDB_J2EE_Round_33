
package mamun;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadBook {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
        File f2 = new File("myFile.ser");
        FileInputStream fis = new FileInputStream(f2);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Book b1 =(Book) ois.readObject();
        System.out.println(b1.getISBNNumber());
        System.out.println(b1.getAuthor());
        }catch(IOException ioe){
        ioe.printStackTrace();
        }
    }
}
