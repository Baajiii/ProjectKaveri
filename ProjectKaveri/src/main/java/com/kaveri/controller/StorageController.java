package com.kaveri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaveri.details.AddQuantityDetails;
import com.kaveri.models.Storage;
import com.kaveri.response.QuantityResponse;
import com.kaveri.response.StroageResponse;
import com.kaveri.service.AddQuantityService;
import com.kaveri.service.StorageService;

@RestController
public class StorageController {

	@Autowired
	private StorageService service;
	
	@Autowired
	private AddQuantityService addservice;
	
	
	//Add product to the storage
	@PostMapping("/addproduct")
	public StroageResponse storeproduct(@RequestBody Storage product) {
		
		return service.StoreProduct(product);
	}
	
	
	//Add Quantity to the product
	@PostMapping("/addquantity")
	public QuantityResponse AddQuantity(@RequestBody AddQuantityDetails details) {
		
		return addservice.AddQuantity(details);
	}
	
	//TO view all the products
	@GetMapping("/allproducts")
	public List<Storage> allproducts(){
		return service.AllProducts();
	}
}
