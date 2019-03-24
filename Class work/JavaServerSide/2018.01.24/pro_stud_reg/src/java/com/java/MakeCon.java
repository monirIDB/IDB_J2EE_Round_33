
package com.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author l2pc208e
 */
public class MakeCon {
    public static void main(String[] args) {
        MakeCon mc=new MakeCon();
        mc.doInert();
    }
    public void doThis(){
    
    }

    private DataSource getMyReff() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/myReff");
    }
    public void doInert(){
        try {
            DataSource con= getMyReff();
            Connection cn=con.getConnection();
            PreparedStatement pstm=cn.prepareStatement("Insert into logtable values(201,'monir', 'zaman', 'email', 82837)");
           int n=pstm.executeUpdate();
           if(n>0){
               System.out.println("ok");
           }else{
                System.out.println("not ok");
           }
            
        } catch (Exception ex) {
            Logger.getLogger(MakeCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
