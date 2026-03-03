package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.beans.Employee;

public class EmployeeApp {
	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
		Employee bean = context.getBean("emp", Employee.class);
		bean.getEmployeeDetails();
	}
}
