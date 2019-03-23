
package com.pojo;

import com.util.NewHibernateUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
public class StudentDAO {
    public boolean doAdd(Student l) {
        boolean ret = false;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Serializable ser = s.save(l);
        s.getTransaction().commit();
        s.close();
        if (ser != null) {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }
    
    public Student aUser(int id, String pass) {
        Student lo = null;
        List<Student> lis;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Student where id=:a and password=:b");
        q.setInteger("a", id);
        q.setString("b", pass);
        lis = q.list();
        try {      
        if (lis!= null) {
             lo = lis.get(0);          
        } else {    
           lo = null;  
        }
        } catch (Exception e) {
            return lo;
        }
        return lo;
    }
    
}
