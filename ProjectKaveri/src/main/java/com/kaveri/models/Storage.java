package com.kaveri.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Storage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Productid;
	
	private String Productname;
	
	private String Brandname;
	
	private long Quantity;


	public int getProductid() {
		return Productid;
	}


	public void setProductid(int productid) {
		Productid = productid;
	}


	public String getProductname() {
		return Productname;
	}


	public void setProductname(String productname) {
		Productname = productname;
	}


	public String getBrandname() {
		return Brandname;
	}


	public void setBrandname(String brandname) {
		Brandname = brandname;
	}


	public long getQuantity() {
		return Quantity;
	}


	public void setQuantity(long quantity) {
		Quantity = quantity;
	}


	@Override
	public String toString() {
		return "Storage [Productid=" + Productid + ", ProductName=" + Productname + ", BrandName=" + Brandname
				+ ", Quantity=" + Quantity + "]";
	}
	
	
}
