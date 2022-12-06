package com.kaveri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaveri.models.Storage;
import com.kaveri.response.StroageResponse;
import com.kaveri.service.StorageService;

@RestController
public class StorageController {

	@Autowired
	private StorageService service;
	
	@PostMapping("/addproduct")
	public StroageResponse storeproduct(@RequestBody Storage product) {
		
		return service.StoreProduct(product);
	}
	
}
