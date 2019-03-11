
package com.dbconnected;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    String url="jdbc:mysql://localhost:3306/bank";
    String user="root";
    String pass="apcl123456";
    Connection con;
    public Connection doConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
