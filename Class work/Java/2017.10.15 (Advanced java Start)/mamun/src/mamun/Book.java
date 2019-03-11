
package mamun;

import java.io.Serializable;


public class Book implements Serializable{
    int ISBNNumber;
    String Author;

    public Book() {
    }

    public Book(int ISBNNumber, String Author) {
        this.ISBNNumber = ISBNNumber;
        this.Author = Author;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBNNumber=" + ISBNNumber + ", Author=" + Author + '}';
    }
    
}
