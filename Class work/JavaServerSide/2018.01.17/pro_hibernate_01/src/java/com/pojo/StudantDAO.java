package com.pojo;


import com.pojo.Studant;
import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class StudantDAO {
     public void doAdd(Studant stu){
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    s.beginTransaction();
    s.save(stu);
    s.getTransaction().commit();
    s.close();
    }
     public void doUp(Studant stu){
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    s.beginTransaction();
    s.update(stu);
    s.getTransaction().commit();
    s.close();
    }
      public void doDel(Studant stu){
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    s.beginTransaction();
    s.delete(stu);
    s.getTransaction().commit();
    s.close();
    }
     public List <Integer> allId(){
    List <Integer> li=new ArrayList <Integer>();
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    Query q=s.createQuery("select id from Studant");
    li=q.list();
    return li;      
    }
      public Studant aStudant(int id){
    Studant std=new Studant();
    List <Studant> li=new ArrayList <Studant>();
    Session s=NewHibernateUtil.getSessionFactory().openSession();
//     SessionFactory sf= NewHibernateUtil.getSessionFactory();
//     Session sn=sf.openSession();
    Query q=s.createQuery("from Studant where id="+id);
    li=q.list();
    std=li.get(0);
    return std;
    }
     public List<Studant> showAllStudant() {
        List<Studant> li = new ArrayList<Studant>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Studant");
        li = q.list();
        return li;
    }
}
