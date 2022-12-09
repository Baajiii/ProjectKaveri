package com.kaveri.service;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaveri.details.DateDetails;
import com.kaveri.models.Price;
import com.kaveri.repository.PriceRepository;
import com.kaveri.response.PriceResponse;
import com.kaveri.response.StroageResponse;

@Service
public class PricingService {

	@Autowired
	private PriceRepository priRepo;
	
	public PriceResponse AddPrice(Price details) {
		LocalDate today = LocalDate.now();
		PriceResponse response = new PriceResponse();
		String message ="Rs. " +  details.getPrice() + "  is fixed for " + details.getBrandname() + " " + details.getProductname();
		boolean flag = true;
		
		if(details.getPrice()<=0.0) {
			message = "Enter the product price properly";
			flag = false;
		}
		
		if(flag) {
			details.setDate(today);
			priRepo.save(details);
		}
		response.setStatus(flag);
		response.setMessage(message);
		response.setBrandname(details.getBrandname());
		response.setPrice(details.getPrice());
//		System.out.println(today);
		return response;
	}
	
	
	public List<Price> checkPrice(String brandname) {
		
		List<Price> p = priRepo.findByDateAndName(brandname);
		return p;
	}
	
	
	public List<Price> CheckPriceByDate(){
		
		LocalDate date = LocalDate.now();
		return priRepo.findBydate(date);
	}
}
