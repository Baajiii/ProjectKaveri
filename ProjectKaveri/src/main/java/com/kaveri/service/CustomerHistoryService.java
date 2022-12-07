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

	@Autowired
	public StroageRepository strRepo;

	public CustomerResponse BillingForm(String Customername, String Phonenumber, String Productname, String brandname,
			long Quantity, String Vechileno, String Address) {

		LocalDate today = LocalDate.now();

		CustomerResponse response = new CustomerResponse();

		CustomerHistory row = new CustomerHistory();

		boolean flag = true;
		try {
			Storage str = strRepo.findByBrandName(brandname);
//			System.out.println(str.getBrandname());
//			System.out.println("hiii");
			if (str.getQuantity() >= Quantity) {
				str.setQuantity(str.getQuantity() - Quantity);
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
			} else if(str.getQuantity()== 0) {
				flag = false;
				response.setMessage(brandname + " is Out Of Stock");
				response.setStatus(flag);
			}
			else {
				flag = false;
				response.setMessage("Only " + str.getQuantity() + " Kg is available in " + str.getBrandname() + " " +  str.getProductname());
				response.setStatus(flag);
			}
		} catch (Exception e) {
			flag = false;
			response.setMessage("Something Went Wrong!.....");
			response.setStatus(flag);

		}
		response.setName(Customername);
		return response;

	}
}
