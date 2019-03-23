/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.User;
import com.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author l2pc203e
 */
public class UserDAO {

    public void doSave(User u) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
        s.close();
    }

    public User aUser(int id, String password) {
        User u = null;
        List<User> li;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from User where id=:a and password=:b");
        q.setInteger("a", id);
        q.setString("b", password);
        li = q.list();
        try {
            if (li != null) {
                u = li.get(0);
            } else {
                u = null;
            }
        } catch (Exception e) {
            return u;
        }
        return u;
    }
}
