package com.kaveri.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaveri.details.HistoryDetails;
import com.kaveri.models.CustomerHistory;
import com.kaveri.response.CustomerResponse;
import com.kaveri.service.CustomerHistoryService;

@RestController
public class CustomerHistoryController {

	@Autowired
	private CustomerHistoryService service;
	
	@PostMapping("/billing")
	public CustomerResponse customerhistory(@RequestBody HistoryDetails details ) {
		
		return service.BillingForm(details.getCustomername(), details.getPhonenumber(), details.getProductname(), details.getBrandname(), details.getQuantity(), details.getVehicleno(), details.getAddress());
	}
}
