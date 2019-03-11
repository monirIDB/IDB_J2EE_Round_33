package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    String url = "jdbc:mysql://localhost:3306/db1";
    String user = "root";
    String pass = "apcl123456";
    Connection con;

    public Connection doConnect() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException cf){
            cf.printStackTrace();
        }
        return con;
    }
    public void doClose(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
