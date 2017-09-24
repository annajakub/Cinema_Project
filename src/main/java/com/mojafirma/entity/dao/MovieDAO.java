package com.mojafirma.entity.dao;
//data acces object. Opreacje (CRUD) Create Read Update Delete

import com.mojafirma.HibernateUtil;
import com.mojafirma.entity.Movie;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovieDAO {

    public Integer addMovie (Movie movie){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer movieID = null;
        try{
            tx = session.beginTransaction();
            movieID = (Integer) session.save(movie);
            tx.commit();

        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }return movieID;

    }


}
