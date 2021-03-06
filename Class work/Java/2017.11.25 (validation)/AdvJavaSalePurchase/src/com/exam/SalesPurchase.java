/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teacher
 */
public class SalesPurchase extends javax.swing.JFrame {

    /**
     * Creates new form SalesPurchase
     */
    public SalesPurchase() {
        initComponents();
        ddPidInitialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        ddPid = new javax.swing.JComboBox<>();
        pname = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        uprice = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        tprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TID");

        jlabel.setText("PID");

        jLabel3.setText("Pname");

        jLabel4.setText("Stock");

        jLabel5.setText("UnitPrice");

        jLabel6.setText("Quanty");

        jLabel2.setText("TotalPrice");

        ddPid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ddPidItemStateChanged(evt);
            }
        });

        jButton1.setText("Sale");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Purchase");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(uprice))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jlabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tid)
                            .addComponent(ddPid, 0, 247, Short.MAX_VALUE)
                            .addComponent(pname)
                            .addComponent(stock)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(46, 46, 46)
                                .addComponent(jButton2)
                                .addGap(0, 72, Short.MAX_VALUE))
                            .addComponent(quantity)
                            .addComponent(tprice))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(ddPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(uprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ddPidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ddPidItemStateChanged
        // TODO add your handling code here:
        ddPidOnChange();
    }//GEN-LAST:event_ddPidItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            String sourceURL = "jdbc:mysql://localhost:3306/advanceevd";
            String username = "root";
            String password = "apcl123456";

            Connection databaseConnection = DriverManager.getConnection(sourceURL, username, password);

            //insert code
            String addquery = "INSERT INTO transaction(tid,pid,pname,uprice,quantity,tprice) VALUES(?,?,?,?,?,?)";
            PreparedStatement addpstmt = databaseConnection.prepareStatement(addquery);
            addpstmt.setInt(1, Integer.parseInt(tid.getText()));
            addpstmt.setInt(2, Integer.parseInt(ddPid.getSelectedItem().toString()));
            addpstmt.setString(3, pname.getText());
            addpstmt.setInt(4, Integer.parseInt(uprice.getText()));
            addpstmt.setInt(5, Integer.parseInt(quantity.getText()));
            addpstmt.setInt(6, Integer.parseInt(tprice.getText()));

            int addrowAffected = addpstmt.executeUpdate();
            System.out.println("Data inserted");

            String udquery = "UPDATE product SET stock=? WHERE pid=?";
            PreparedStatement uppstmt = databaseConnection.prepareStatement(udquery);
            int nowStock = Integer.parseInt(stock.getText()) - Integer.parseInt(quantity.getText());
            uppstmt.setInt(1, nowStock);
            uppstmt.setInt(2, Integer.parseInt(ddPid.getSelectedItem().toString()));
            int uprowAffected = uppstmt.executeUpdate();
            stock.setText(String.valueOf(nowStock));
            System.out.println("Data Updated");

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {

            String sourceURL = "jdbc:mysql://localhost:3306/advanceevd";
            String username = "root";
            String password = "apcl123456";

            Connection databaseConnection = DriverManager.getConnection(sourceURL, username, password);

            //insert code
            String addquery = "INSERT INTO transaction(tid,pid,pname,uprice,quantity,tprice) VALUES(?,?,?,?,?,?)";
            PreparedStatement addpstmt = databaseConnection.prepareStatement(addquery);
            addpstmt.setInt(1, Integer.parseInt(tid.getText()));
            addpstmt.setInt(2, Integer.parseInt(ddPid.getSelectedItem().toString()));
            addpstmt.setString(3, pname.getText());
            addpstmt.setInt(4, Integer.parseInt(uprice.getText()));
            addpstmt.setInt(5, Integer.parseInt(quantity.getText()));
            addpstmt.setInt(6, Integer.parseInt(tprice.getText()));

            int addrowAffected = addpstmt.executeUpdate();
            System.out.println("Data inserted");

            String udquery = "UPDATE product SET stock=? WHERE pid=?";
            PreparedStatement uppstmt = databaseConnection.prepareStatement(udquery);
            int nowStock = Integer.parseInt(stock.getText()) + Integer.parseInt(quantity.getText());
            uppstmt.setInt(1, nowStock);
            uppstmt.setInt(2, Integer.parseInt(ddPid.getSelectedItem().toString()));
            int uprowAffected = uppstmt.executeUpdate();
            stock.setText(String.valueOf(nowStock));
            System.out.println("Data Updated");

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void ddPidOnChange() {
        try {
            String sourceURL = "jdbc:mysql://localhost:3306/advanceevd";
            String username = "root";
            String password = "apcl123456";

            Connection databaseConnection = DriverManager.getConnection(sourceURL, username, password);

            String udquery = "SELECT * FROM product WHERE pid=?";
            PreparedStatement uppstmt = databaseConnection.prepareStatement(udquery);

            uppstmt.setString(1, ddPid.getSelectedItem().toString());

            ResultSet rs = uppstmt.executeQuery();
            while (rs.next()) {
                pname.setText(rs.getString(2));
                stock.setText(rs.getString(3));
                uprice.setText(rs.getString(4));
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }

    public void ddPidInitialize() {

        try {
            String sourceURL = "jdbc:mysql://localhost:3306/advanceevd";
            String username = "root";
            String password = "apcl123456";

            Connection databaseConnection = DriverManager.getConnection(sourceURL, username, password);

            String pidQuery = "SELECT * FROM product";
            PreparedStatement rowcountpstmt = databaseConnection.prepareStatement(pidQuery);
            ResultSet rs = rowcountpstmt.executeQuery();

            ddPid.removeAllItems();
            while (rs.next()) {

                ddPid.addItem(String.valueOf(rs.getInt(1)));
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesPurchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ddPid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField uprice;
    // End of variables declaration//GEN-END:variables
}
