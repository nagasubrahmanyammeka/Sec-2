package com.klu.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.klu.entity.Student;

public class StudentApp {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		 Session s = sf.openSession();
		 /*//String hql = "From Student where course >= :fees"; 
		   //Converting the HQL into SQL
		 * Query<Student> query = s.createQuery(hql, Student.class);
		 * 
		 * //Reading the course name from the Console and Initializing the Parameter
		 * System.out.println("Enter the Fees Limit: ");
		 *  int cr = reader.nextInt();
		 * query.setParameter("fees", cr);
		 * 
		 * List<Student> resultList = query.getResultList();
		 * resultList.forEach(r->System.out.println(r)); 
		 * for(Student r:resultList) {
		 * System.out.println("------------");
		 * System.out.println("Name: "+r.getSname());
		 * System.out.println("Course: "+r.getCourse());
		 * System.out.println("Fees: "+r.getFees()); } s.close();
		 */
		
		
		String hql1 = "From Student where course = ?1 and fees = ?2";
		s=sf.openSession();
		Query<Student> query1 = s.createQuery(hql1, Student.class);

		//System.out.println("Enter the Fees Limit: ");
		//int cr1 = reader.nextInt();
		query1.setParameter(1,"DAV");
		query1.setParameter(2, 10000);
		
		List<Student> resultList1 = query1.getResultList();
		//resultList1.forEach(r->System.out.println(r));
		for(Student r:resultList1) {
			System.out.println("------------");
			System.out.println("Name: "+r.getSname());
			System.out.println("Course: "+r.getCourse());
			System.out.println("Fees: "+r.getFees());
		}
		
		//HQL: Fetch all columns in the descending order
		//String hql2="From Student order by fees desc";
		//s=sf.openSession();
		//Query<Student> query = s.createQuery(hql2, Student.class);
		//List<Student> res = query.getResultList();
		// res.forEach(r->System.out.println(r));
		//for(Student r:res) {
			//System.out.println("--------------");
			//System.out.println("ID: "+r.getId());
			//System.out.println("Name: "+r.getSname());
			//System.out.println("Course: "+r.getCourse());
			//System.out.println("Fees: "+r.getFees());
		//}
		//use these approach if there is no toString method in the entity class
		//res.forEach(r->{
			//System.out.println(r.getId()+"\t"+r.getSname()+"\t"+r.getCourse()+"\t"+r.getFees());
		//});
		
		//Aggregate Functions
		String count = "select count(*) from Student";
		String avg = "Select avg(fees) from Student";
		String sum = "Select sum(fees) from Student";
		String min = "Select min(fees) from Student";
		String max = "Select max(fees) from Student";
		s = sf.openSession();
		Query<Long> query = s.createQuery(count, Long.class);
		Long countval = query.getSingleResult();
		System.out.println("No.of Student Records: "+countval);
		Query<Double> q1 = s.createQuery(sum, Double.class);
		Double sumval = q1.getSingleResult();
		System.out.println("Total Fees: "+sumval);
		Query<Double> q2 = s.createQuery(avg, Double.class);
		Double avgval = q2.getSingleResult();
		System.out.println("Total average of the Fees: "+avgval);
		Query<Double> q3 = s.createQuery(min, Double.class);
		Double minval = q3.getSingleResult();
		System.out.println("Minimum Value: "+minval);
		Query<Double> q4 = s.createQuery(max, Double.class);
		Double maxval = q4.getSingleResult();
		System.out.println("Maximum Value: "+maxval);
		s.close();
		
		//HQL: Pagination (displaying specific no.of recoreds per page)
		String hql5 = "From Student";
		s=sf.openSession();
		Query<Student>  q5 = s.createQuery(hql5, Student.class);
		q5.setFirstResult(0);
		q5.setMaxResults(7);
		List<Student> res = q5.getResultList();
		res.forEach(r-> System.out.println(r));
		sf.close();
	}
}
