package com.kaveri.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String Customername;
	
	private String Phonenumber;
	
	private String Productname;
	
	private String Brandname;
	
	private long Quantity;
	
	private String Vehicleno;
	
	private LocalDate date;
	
	private String Address;
	
	private String invoiceno;
	
	private String hsncode;
	 
	private String dispatch;
	
	private String Ewaybill;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomername() {
		return Customername;
	}

	public void setCustomername(String customername) {
		Customername = customername;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public long getQuantity() {
		return Quantity;
	}

	public void setQuantity(long quantity) {
		Quantity = quantity;
	}

	public String getVehicleno() {
		return Vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		Vehicleno = vehicleno;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	

	public String getBrandname() {
		return Brandname;
	}

	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	
	

	public String getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getHsncode() {
		return hsncode;
	}

	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
	}

	

	public String getDispatch() {
		return dispatch;
	}

	public void setDispatch(String dispatch) {
		this.dispatch = dispatch;
	}

	public String getEwaybill() {
		return Ewaybill;
	}

	public void setEwaybill(String ewaybill) {
		Ewaybill = ewaybill;
	}

	@Override
	public String toString() {
		return "CustomerHistory [id=" + id + ", Customername=" + Customername + ", Phonenumber=" + Phonenumber
				+ ", Productname=" + Productname + ", Brandname=" + Brandname + ", Quantity=" + Quantity
				+ ", Vehicleno=" + Vehicleno + ", date=" + date + ", Address=" + Address + ", invoiceno=" + invoiceno
				+ ", hsncode=" + hsncode + ", dispatch=" + dispatch + ", Ewaybill=" + Ewaybill + "]";
	}

	
	
	
	
}
