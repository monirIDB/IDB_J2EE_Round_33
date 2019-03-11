package my.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dconnection {

    public static void main(String[] args) {
        Dconnection dc = new Dconnection();
        Pen p = new Pen("Matador", 5, "Black", "01-02-2017");
        dc.doSave(p);
    }

    private void doSave(Pen p1) {

        String url = "jdbc:mysql://localhost:3306/db3";
        String user = "root";
        String pass = "apcl123456";
        try {
            Class.forName("con.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String st = "insert into pen(brand,price,incolor,manudate) values(?,?,?,?)";
            PreparedStatement pm = con.prepareStatement(st);

            pm.setString(1, p1.getBrand());
            pm.setInt(2, p1.getPrice());
            pm.setString(3, p1.getInkcolor());
            pm.setString(4, p1.getManudate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
