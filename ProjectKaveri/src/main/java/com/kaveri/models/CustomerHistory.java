package com.kaveri.models;

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
	
	private String CustomerName;
	
	private String PhoneNumber;
	
	private String ProductName;
	
	private long Quantity;
	
	private String VehicleNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public long getQuantity() {
		return Quantity;
	}

	public void setQuantity(long quantity) {
		Quantity = quantity;
	}

	public String getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}

	@Override
	public String toString() {
		return "CustomerHistory [id=" + id + ", CustomerName=" + CustomerName + ", PhoneNumber=" + PhoneNumber
				+ ", ProductName=" + ProductName + ", Quantity=" + Quantity + ", VehicleNo=" + VehicleNo + "]";
	}
	
	
	
}
