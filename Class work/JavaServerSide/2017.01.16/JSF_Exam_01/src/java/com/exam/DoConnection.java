
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;


public class DoConnection {
    Connection con;
    String url="jdbc:mysql://localhost:3306/db2";
    String user="root";
    String pass="apcl123456";
    public Connection doCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
    
}
