package com.kaveri.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaveri.details.HistoryDetails;
import com.kaveri.models.CustomerHistory;
import com.kaveri.response.CustomerResponse;
import com.kaveri.service.CustomerHistoryService;

@RestController
@CrossOrigin
public class CustomerHistoryController {

	@Autowired
	private CustomerHistoryService service;
	
	
	//To Add customer details
	@PostMapping("/billing")
	public CustomerResponse customerhistory(@RequestBody HistoryDetails details ) {
		
		return service.BillingForm(details.getCustomername(), details.getPhonenumber(), details.getProductname(), details.getBrandname(), details.getQuantity(), details.getVehicleno(), details.getAddress(), details.getInvoiceno(), details.getHsncode(), details.getDispatch(), details.getEwaybill());
	}
	
	//To see customer details
	@GetMapping("/allhistory")
	public List<CustomerHistory> Allhistory(){
		return service.Allhistory();
	}
}
