package com.klu.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private int pid;
	private String pname;
	private double price;
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public void getProductDetails() {
		System.out.println("Product ID: "+pid);
		System.out.println("Product NameL: "+pname);
		System.out.println("product Price: "+price);
	}
}
