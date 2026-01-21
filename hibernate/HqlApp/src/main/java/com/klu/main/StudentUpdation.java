package com.klu.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.klu.entity.Student;

public class StudentUpdation {
  public static void main(String[] args) {
	  Scanner reader = new Scanner(System.in);
    SessionFactory sf=new Configuration().configure().buildSessionFactory();
	/*
	 * Session s = sf.openSession(); Transaction tx = s.beginTransaction();
	 * 
	 * String hqlUpdate =
	 * "Update Student SET fees = fees+1000 Where course = :course"; MutationQuery
	 * query = s.createMutationQuery(hqlUpdate);
	 * query.setParameter("course","Java"); int res= query.executeUpdate();
	 * System.out.println(res); s.close(); tx.commit();
	 */
//    Session s = sf.openSession();
//    Transaction tx = s.beginTransaction();
//    
//    String hqlUpdate = "Delete from Student Where course = :course";
//    MutationQuery query = s.createMutationQuery(hqlUpdate);
//    query.setParameter("course","OS");
//    int res= query.executeUpdate();
//    System.out.println(res);
//    s.close();
//    tx.commit();
    Session s=sf.openSession();
    Transaction tx = s.beginTransaction();
    String name;
    String course;
    Double fees;
    Student st=null;
    int len;
    System.out.println("Enter no.of recordes to be inserted: ");
    len = reader.nextInt();
    
    for(int i=1;i<=len;i++) {
    	reader.nextLine();
    	System.out.println("Enter Student Name: ");
    	name = reader.nextLine();
    	System.out.println("Enter Course Name: ");
    	course = reader.nextLine();
    	System.out.println("Enter Course Fees: ");
    	fees = reader.nextDouble();
    	st  = new Student();+
    	st.setSname(name);
    	st.setFees(fees);
    	st.setCourse(course);
    	s.persist(st);

    }
    tx.commit();
    sf.close();
    
  }
}