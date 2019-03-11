
package my.com;



public class Pen {
    String brand;
    int price;
    String inkcolor;
    String manudate;

    public Pen() {
    }

    public Pen(String brand, int price, String inkcolor, String manudate) {
        this.brand = brand;
        this.price = price;
        this.inkcolor = inkcolor;
        this.manudate = manudate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInkcolor() {
        return inkcolor;
    }

    public void setInkcolor(String inkcolor) {
        this.inkcolor = inkcolor;
    }

    public String getManudate() {
        return manudate;
    }

    public void setManudate(String manudate) {
        this.manudate = manudate;
    }
    
}
