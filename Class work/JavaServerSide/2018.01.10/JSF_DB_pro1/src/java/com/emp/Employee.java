
package com.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;
     private int selectedId;
    private String selectedName;
    private List<Employee> stList = new ArrayList<Employee>();
    DBCon dbCon= new DBCon();

    public Employee() {
    }

    public Employee(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void doInsert() {
        try {
            Connection con = dbCon.doCon();

            String ss = "insert into employee values (?,?,?,?)";

            PreparedStatement pstm = con.prepareStatement(ss);
            pstm.setInt(1, id);
            pstm.setString(2, name);
            pstm.setString(3, email);
            pstm.setString(4, phone);

            int n = pstm.executeUpdate();
            doShow();//doShow Data on Display Page
        } catch (Exception e) {
        }
    }
    public void doDelete() {
        try {
            Connection con = dbCon.doCon();
            String ss = "delete from employee where id = ?";
            PreparedStatement pstm = con.prepareStatement(ss);
            pstm.setInt(1, id);
            int n = pstm.executeUpdate();
            doShow(); //doShow data on display page
        } catch (Exception e) {

        }
    }
    public void doShow() {
        try {
            Connection con = dbCon.doCon();

            String ss = "select * from employee";

            PreparedStatement pstm = con.prepareStatement(ss);

            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Employee s = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                stList.add(s);
            }
        } catch (Exception e) {
        }
    }

    public List<Employee> getStList() {
        return stList;
    }

    public void setStList(List<Employee> stList) {
        this.stList = stList;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public String getSelectedName() {
        return selectedName;
    }

    public void setSelectedName(String selectedName) {
        this.selectedName = selectedName;
    }
    
}
