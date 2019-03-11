package com.DBMethod;

import com.account.Account;
import com.dbconnected.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AllMethod {

    Connection con;
    PreparedStatement pstm;

    public boolean doSave(Account a) {
        DBConnection db = new DBConnection();
        boolean ret = false;
        try {
            try {
                con = db.doConnect();
                String st = "INSERT INTO account VALUES(?,?,?,?,?)";
                pstm = con.prepareStatement(st);
                pstm.setInt(1, a.getId());
                pstm.setString(2, a.getName());
                pstm.setString(3, a.getType());
                pstm.setString(4, a.getBranch());
                pstm.setFloat(5, a.getBalance());
                int i = pstm.executeUpdate();
                if (i > 0) {
                    ret = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    pstm.close();
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public boolean doUpdate(Account a) {
        DBConnection cd = new DBConnection();
        boolean ret = false;
        try {
            con = cd.doConnect();
            String st = "UPDATE account SET name=?, type=?, branch=?, balance=? WHERE id=?";
            pstm = con.prepareStatement(st);
            pstm.setString(1, a.getName());
            pstm.setString(2, a.getType());
            pstm.setString(3, a.getBranch());
            pstm.setFloat(4, a.getBalance());
            pstm.setInt(5, a.getId());

            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }

    public boolean doDelete(Account a) {
        DBConnection cd = new DBConnection();
        boolean ret = false;
        try {
            con = cd.doConnect();
            String st = "DELETE FROM account WHERE id=?";
            pstm = con.prepareStatement(st);
            pstm.setInt(1, a.getId());
            int i = pstm.executeUpdate();
            if (i > 0) {
                ret = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return ret;
    }

    public ArrayList<Account> findAllAccount() {
        DBConnection cd = new DBConnection();
        ArrayList<Account> allProducts = new ArrayList<Account>();
        try {
            con = cd.doConnect();
            String st = "SELECT * FROM account";
            pstm = con.prepareStatement(st);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Account p = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
                allProducts.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return allProducts;
    }

    public Account findAccount(int id) {
        DBConnection cd = new DBConnection();
        Account a = null;
        try {
            con = cd.doConnect();
            pstm = con.prepareStatement("SELECT * FROM account WHERE id=?");
            pstm.setInt(1, id);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                a = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pstm.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return a;
    }

}
