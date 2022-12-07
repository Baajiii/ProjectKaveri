package com.kaveri.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaveri.models.CustomerHistory;
import com.kaveri.models.Storage;
import com.kaveri.repository.CustomerRepository;
import com.kaveri.repository.StroageRepository;
import com.kaveri.response.CustomerResponse;

@Service
public class CustomerHistoryService {

	@Autowired
	public CustomerRepository cusRepo;
	
	public StroageRepository strRepo;
	
	
	public CustomerResponse BillingForm(String Customername, String Phonenumber, String Productname, String brandname, long Quantity, String Vechileno, String Address) {
		
		LocalDate today = LocalDate.now();
		
		CustomerResponse response = new CustomerResponse();
		
		CustomerHistory row = new CustomerHistory();
		
		boolean flag = true;
		try {
			Storage str = strRepo.findByBrandName(brandname);
			str.setQuantity(str.getQuantity()- Quantity);
			strRepo.save(str);
			
		row.setCustomername(Customername);
		row.setPhonenumber(Phonenumber);
		row.setProductname(Productname);
		row.setQuantity(Quantity);
		row.setVehicleno(Vechileno);
		row.setAddress(Address);
		row.setDate(today);
		row.setBrandname(brandname);
		cusRepo.save(row);
		response.setMessage("Order Booked");
		response.setStatus(flag);
		}
		catch (Exception e) {
			flag = false;
			response.setMessage(brandname + " is Out Of Stock");
			response.setStatus(flag);
			
		}
		response.setName(Customername);
		return response;
		
	}
}
