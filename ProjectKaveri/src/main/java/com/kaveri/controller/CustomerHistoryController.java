package com.kaveri.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaveri.models.CustomerHistory;
import com.kaveri.response.CustomerResponse;
import com.kaveri.service.CustomerHistoryService;

@RestController
public class CustomerHistoryController {

	@Autowired
	private CustomerHistoryService service;
	
	@PostMapping("/billing")
	public CustomerResponse customerhistory(@PathVariable String customername, @PathVariable String phonenumber, @PathVariable String productname, @PathVariable String brandname, @PathVariable long quantity, @PathVariable String vechilenumber, @PathVariable String address ) {
		
		return service.BillingForm(customername, phonenumber, productname, brandname, quantity, vechilenumber, address);
	}
}
