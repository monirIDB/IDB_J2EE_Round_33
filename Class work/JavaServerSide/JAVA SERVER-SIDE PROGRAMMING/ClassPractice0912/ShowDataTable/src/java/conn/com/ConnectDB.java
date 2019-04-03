/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Apcl 208
 */
public class ConnectDB {
    Connection con;
    PreparedStatement pstm;
    public Connection doConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root", "apcl123456");
            
            
        } catch (ClassNotFoundException ex) {
           
        }catch(SQLException e){
        
        }
       return con; 
    }
}
