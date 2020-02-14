package com.springORM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String Productname;
	@Column(name = "description")
	private String Productdesc;
	@Column(name = "price")
	private double Productprice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public String getProductdesc() {
		return Productdesc;
	}

	public void setProductdesc(String productdesc) {
		Productdesc = productdesc;
	}

	public double getProductprice() {
		return Productprice;
	}

	public void setProductprice(double productprice) {
		Productprice = productprice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Productname=" + Productname + ", Productdesc=" + Productdesc + ", Productprice="
				+ Productprice + "]";
	}

	
}
