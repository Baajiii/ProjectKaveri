package com.kaveri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaveri.models.Storage;
import com.kaveri.repository.StroageRepository;
import com.kaveri.response.StroageResponse;

@Service
public class StorageService {

	@Autowired
	private StroageRepository storage;
	
	public StroageResponse StoreProduct(Storage product) {
		
		StroageResponse response = new StroageResponse();
		String message = "Product added successfully";
		boolean flag = true;
		
		if(product.getQuantity()<=0) {
			message = "Enter the product Quantity properly";
			flag = false;
		}
		
		if(flag) {
			storage.save(product);
		}
		response.setStatus(flag);
		response.setMessage(message);
		return response;
		
	}
	
	
	public List<Storage> AllProducts(){
		
		return storage.findAll();
	}
}
