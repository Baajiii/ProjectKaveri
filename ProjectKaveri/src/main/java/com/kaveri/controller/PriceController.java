package com.kaveri.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaveri.details.DateDetails;
import com.kaveri.details.PriceDetails;
import com.kaveri.models.Price;
import com.kaveri.response.PriceResponse;
import com.kaveri.service.PricingService;

@RestController
@CrossOrigin
public class PriceController {

	@Autowired
	private PricingService service;

	//To add price to the product
	@PostMapping("/addprice")
	public PriceResponse Addprice(@RequestBody Price details) {
		return service.AddPrice(details);
	}

	//Search the price using brandname
	@GetMapping("/chechprice/{brandname}")
	public List<Price> checkPrice(@PathVariable String brandname) {
		return service.checkPrice(brandname);
	}
	
	//To Check today price
	@GetMapping("/todayprice")
	public List<Price> TodayPrice(){
		return service.CheckPriceByDate();
	}
}
