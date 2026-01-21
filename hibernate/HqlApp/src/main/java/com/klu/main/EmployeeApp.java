package com.klu.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.klu.entity.Employee;

import jakarta.persistence.Tuple;

public class EmployeeApp {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Employee e1 = new Employee("Jaswanth","2400030140@kluniversity.in");
	Employee e2 = new Employee("Gnana Teja","2400030174@kluniversity.in");
	s.persist(e1);
	s.persist(e2);
	Transaction tx = s.beginTransaction();
	tx.commit();
	
	//HQL - To retrive the all data in the Database
	String hql = "from Employee";
	Query<Employee> query = s.createQuery(hql,Employee.class);
	List<Employee> res = query.getResultList();
	//res.forEach(emp -> System.out.println(emp));
	for (Employee emp : res) {
		System.out.println("------------------------------");
		System.out.println("Employee ID:   "+emp.getId());
		System.out.println("Employee Name: "+emp.getEname());
		System.out.println("Employee Email:"+emp.getEmail());

	}
	s.close();
	
	//2. Retriving the all data with the specific columns
	String hql1 = "select ename,email from Employee";
	s=sf.openSession();
	Query<Tuple> query2 = s.createQuery(hql1, Tuple.class);
	List<Tuple> resultList = query2.getResultList();
	for (Tuple tuple : resultList) {
		System.out.println("-----------------");
		System.out.println(tuple.get(0));
		System.out.println(tuple.get(1));
	}
	s.close();
	
	sf.close();
}}

