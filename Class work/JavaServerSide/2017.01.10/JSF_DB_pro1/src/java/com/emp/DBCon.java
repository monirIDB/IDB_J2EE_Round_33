
package com.emp;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBCon {
    Connection con;
    public Connection doCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ss", "root", "apcl123456");
        } catch (Exception e) {
        }
        return con;
    }
}
