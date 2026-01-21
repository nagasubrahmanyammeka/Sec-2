package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.beans.Course;

public class CourseApp {
   public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Course bean = context.getBean("crs", Course.class);
	System.out.println("Course Details: ");
	//System.out.println("Course ID: "+bean.getCid());
	//System.out.println("Course Name: "+bean.getCname());
	bean.display();
	
}
}
