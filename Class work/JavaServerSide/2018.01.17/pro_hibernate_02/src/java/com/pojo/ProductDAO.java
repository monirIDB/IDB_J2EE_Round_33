
package com.pojo;

import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.hibernate.Query;
import org.hibernate.Session;
@ManagedBean
public class ProductDAO {
    public void doInsert(Product02 pro){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(pro);
        s.getTransaction().commit();
        s.close();
    }
    public List<Product02> allID(){
        List<Product02> lt=new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Product02");
        lt=q.list();
        return lt;
    }
    public Product02 aProduct(int id){
        Product02 pro=new Product02();
        List<Product02> lt = new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Product02 Where id="+id);
        lt=q.list();
        pro=lt.get(0);
        return pro;
    }
    public List<Product02> showAllProduct(){
        List<Product02> lt= new ArrayList<>();
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        Query q=s.createQuery("from Product02");
        lt=q.list();
        return lt;
    }
}