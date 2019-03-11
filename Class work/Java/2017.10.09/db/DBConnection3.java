package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DBConnection3 {

    public static void main(String[] args) {
        DBConnection3 dBConnection = new DBConnection3();
        dBConnection.doSave();
    }

    private void doSave() {
        try {
            String url = "jdbc:mysql://localhost:3306/db1";
            String user = "root";
            String pass = "apcl123456";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            String st = "INSERT INTO student(sid,name,email,height,admitdate) values(?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(st);
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            String name = sc.next();
            String email = sc.next();
            float height = sc.nextFloat();
            String admitDate = sc.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date d1 = sdf.parse(admitDate);
            Student st1 = new Student(id, name, email, height, d1);

            pstm.setInt(1, st1.getSid());
            pstm.setString(2, st1.getName());
            pstm.setString(3, st1.getEmail());
            pstm.setFloat(4, st1.getHeight());
            java.sql.Date sqlDate = new java.sql.Date(st1.getAdmitDate().getTime());
            pstm.setDate(5, sqlDate);

            int i1 = pstm.executeUpdate();
            if (i1 > 0) {
                System.out.println("Your information is successfully add");
            } else {
                System.out.println("Your information is not successfully add");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
