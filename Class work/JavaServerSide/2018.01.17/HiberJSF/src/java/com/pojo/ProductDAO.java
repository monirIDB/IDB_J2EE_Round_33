
package com.pojo;

import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class ProductDAO {
    public void doAdd(Product pd){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(pd);
        s.getTransaction().commit();
        s.close();
    }
    public void doUp(Product pd){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(pd);
        s.getTransaction().commit();
        s.close();
    }
    public void doDel(Product pd){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(pd);
        s.getTransaction().commit();
        s.close();
    }
    public List<Product> showAllProdut(){
      List<Product> li=new ArrayList<>();
      Session s=NewHibernateUtil.getSessionFactory().openSession();
      Query q=s.createQuery("from Product");
      li=q.list();
      return li;
    }
    public List<Integer> showAllId(){
      List<Integer> li=new ArrayList();
      Session s=NewHibernateUtil.getSessionFactory().openSession();
      Query q=s.createQuery("select pid from Product");
      li=q.list();
      return li;
    }
    public Product aProduct(int pid){
      List<Product> li=new ArrayList();
      Product p=new Product();
      Session s=NewHibernateUtil.getSessionFactory().openSession();
      Query q=s.createQuery("from Product where pid="+pid);
      li=q.list();
      p=li.get(0);
      return p;
    }
    
}
