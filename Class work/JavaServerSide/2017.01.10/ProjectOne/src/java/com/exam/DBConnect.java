/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author l2pc208e
 */
public class DBConnect {
    Connection con; 
            
    public Connection doCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "apcl123456");
            
        } catch (Exception ex) {
           
        }
    return con;
    }
}
