package com.kaveri.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	private String productname;
	
	private String brandname;
	
	private LocalDate date;
	
	private float price;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [Id=" + Id + ", productname=" + productname + ", brandname=" + brandname + ", date=" + date
				+ ", price=" + price + "]";
	}

	
	
	
}
