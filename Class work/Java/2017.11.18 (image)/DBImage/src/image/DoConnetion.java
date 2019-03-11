
package image;

import java.sql.Connection;
import java.sql.DriverManager;


public class DoConnetion {
    String url="jdbc:mysql://localhost:3306/bdimage";
    String user="root";
    String pass="apcl123456";
    Connection con;
   public Connection doCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
