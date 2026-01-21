package com.klu.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.klu.entity.Employee;
import com.klu.entity.Product;
import com.mysql.cj.Session;

import jakarta.transaction.Transaction;

public class EmployeeApp {
  public static void main(String[] args) {
    //retrieving configuration object
    Configuration conf = new Configuration().configure("hibernate.cfg.xml");
    //Retrieving
    //retrieving sessionfactory object
    SessionFactory sf = conf.buildSessionFactory();
    //Employee e = new Employee();
    //CRUD Operations
    //**********
	
	  //1.Inserting 
	  //Employee e = new Employee("Naga","naga@gmail.com");
    Product p = new Product();
    p.setCost(500);
    p.setProduct("Kiwis");
    
	  //Another method
	  //Employee e = new Employee();
	  //e.setEmail("email@gmail.com");
	  //e.setName("Email");
	  //creating the session
	  org.hibernate.Session s = sf.openSession(); 
	  //starting an transaction to store permanently
	  org.hibernate.Transaction tx=s.beginTransaction(); 
	  s.persist(p); 
	//to store parmenantly
	  tx.commit(); 
	   s.close();
	  //************
	     
    
	/*
	 * //2.Read data 
	 * s=sf.openSession(); 
	 * e = s.find(Employee.class, 100);
	 * enter the class and primary key 
	 * System.out.println(e); 
	 * s.close();
	 * //*************
	 */    
    
    //3.Update
	/*
	 * org.hibernate.Session s = sf.openSession(); 
	 * e=s.find(Employee.class, 100);
	 * e.setEmail("Subrahmanyam@gmail.com"); 
	 * e.setEname("Subrahmanyam"); //update
	 * the above details s.merge(e); //updating permanently in the DB
	 * org.hibernate.Transaction tx=s.beginTransaction(); tx.commit(); s.close();
	 */
    //************
	/*
	 * //4.DELETE //Retreiving the DB org.hibernate.Session s= sf.openSession();
	 * e=s.find(Employee.class, 101); 
	 * //delete from the session 
	 * s.remove(e); 
	 * //to permanently delete the data in the db 
	 * org.hibernate.Transaction tx =
	 * s.beginTransaction(); tx.commit(); s.close();
	 */
    
    
    sf.close();
    
  }
}