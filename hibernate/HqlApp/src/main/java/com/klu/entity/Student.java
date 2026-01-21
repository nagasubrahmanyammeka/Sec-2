package com.klu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name",nullable = false,length = 100)
	private String sname;
	
	@Column(name="course",nullable = false,length = 150)
	private String course;
	@Column(name="fees",nullable = false)
	private double fees;
	
	
	public Student(int id, String sname, String course, double fees) {
		super();
		this.id = id;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", course=" + course + ", fees=" + fees + ", getId()="
				+ getId() + ", getSname()=" + getSname() + ", getCourse()=" + getCourse() + ", getFees()=" + getFees()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}


