
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;


public class DoCon {
    Connection con;
    String url="jdbc:mysql://localhost:3306/db1";
    String user="root";
    String pass="apcl123456";
    public Connection doConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
    
    
    
}
