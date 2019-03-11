
package com.mysql;


public class ComMysql {
    public static void main(String[] args) {
        Coumputer cm1=new Coumputer(101,"Mark-1","ASUS",23);
        doSave(cm1);
        
    }
    public void doSave(Coumputer cm){
        String url="jdbc:mysql://localhost:3306/db1";
        String user="root";
        String password="apcl123456";
        try {
            Class.forName("com.mysql.jdbc.driver");
            Connection con=new Connection(url, user, passord)
        } catch (Exception e) {
        }
    }
}
