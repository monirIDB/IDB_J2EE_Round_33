package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/db1";
    String user = "root";
    String password = "apcl123456";

    public Connection doConnect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
        return con;
    }
}
