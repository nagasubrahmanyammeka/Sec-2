package com.klu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

public class StudentUpdationApp {
  public static void main(String[] args) {
    SessionFactory sf=new Configuration().configure().buildSessionFactory();
    Session s = sf.openSession();
    Transaction tx = s.beginTransaction();
    
    String hqlUpdate = "Update Student SET fees = fees+1000 Where course = :course";
    MutationQuery query = s.createMutationQuery(hqlUpdate);
    query.setParameter("course","Java");
    int res= query.executeUpdate();
    System.out.println(res);
    s.close();
    tx.commit();
    
  }
}