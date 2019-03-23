/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author l2pc208e
 */
public class LoginDAO {
    public void doIns(Login m){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(m);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Login> doShow(Login m){
        List<Login> list=new ArrayList<Login>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Login");
        list = q.list();
        s.close();
        return list;
    }
    
     public List<Integer> doShowId(Login m){
        List<Integer> list=new ArrayList<Integer>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("select id from Login");
        list = q.list();
        s.close();
        return list;
    }
     
      public Login ShowById(int id){
        List<Login> list=new ArrayList<Login>();
        Login lg=new Login();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Login where id="+id);
        list = q.list();
        lg=list.get(0);
       
        return lg;
    }
}
