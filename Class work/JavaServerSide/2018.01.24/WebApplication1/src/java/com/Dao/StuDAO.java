/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.pojo.Student;
import com.util.HU;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author l2pc208e
 */
public class StuDAO {
    public void doAdd(Student st){
        Session s = HU.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(st);
        s.getTransaction().commit();
        s.close();
        
    }
    public Student findStudent(String u, String p){
        Student st = null;
        List<Student> stList = null;
        Session s = HU.getSessionFactory().openSession();
        Query q = s.createQuery("from Student where user=:a and pass=:b");
        q.setString("a", u);
        q.setString("b", p);
        stList = q.list();
        try {
            if (stList!= null) {
                st = stList.get(0);
            } else {
                st=null;
            }
        } catch (Exception e) {
            return st;
        }
        return st;
    }
}
