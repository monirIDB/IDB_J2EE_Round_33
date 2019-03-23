package com.pojo;

import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class StudentDAO {

    public void doAdd(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(st);
        s.getTransaction().commit();
        s.close();
    }

    public void doDel(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(st);
        s.getTransaction();
        s.close();
    }

    public void doUp(Student st) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(st);
        s.getTransaction();
        s.close();
    }

     public List<Student> showAllStudent() {
        List<Student> li = new ArrayList<Student>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Student");
        li = q.list();
        return li;
    }
     
      public List <Integer> allId(){
    List <Integer> li=new ArrayList <Integer>();
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    Query q=s.createQuery("select id from Student");
    li=q.list();
    return li;      
    }
    public Student aStudent(int id){
    Student std=new Student();
    List <Student> li=new ArrayList <Student>();
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    Query q=s.createQuery("from Student where id="+id);
    li=q.list();
    std=li.get(0);
    return std;
    }
}
