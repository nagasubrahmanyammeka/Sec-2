package com.klu.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private int cid;
	private String cname;
	private Product product;
	

	//setter for the product using the Autowired
	@Autowired
	public void setProduct(Product product) {
		this.product = product;
	}
	//Setter for the cid and cname
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public void getCustomerDetails() {
		System.out.println("Customer ID: "+cid);
		System.out.println("Customer Name: "+cname);
		System.out.println("Customer Product Details: ");
		product.getProductDetails();
	}
}
