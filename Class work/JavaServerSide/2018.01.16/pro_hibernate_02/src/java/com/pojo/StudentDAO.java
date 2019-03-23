package com.pojo;

import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class StudentDAO {
    public void doInsert(Student stu){
    Session s=NewHibernateUtil.getSessionFactory().openSession();
    s.beginTransaction();
    s.save(stu);
    s.getTransaction().commit();
    s.close();
    }
     public List<Student> showAllStudent() {
        List<Student> li = new ArrayList<Student>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Student");
        li = q.list();
        return li;
    }
}
