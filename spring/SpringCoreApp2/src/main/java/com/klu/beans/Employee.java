package com.klu.beans;

public class Employee {
    private int eid;
    private String ename;
    private double salary;
    private String desig;
    private Department dept;

    // Constructor for Spring injection
    public Employee(int eid, String ename, double salary, String desig, Department dept) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.desig = desig;
        this.dept = dept;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + desig);
        System.out.println("Department ID: " + dept.getDeptid());
        System.out.println("Department Name: " + dept.getDeptname());
    }
}