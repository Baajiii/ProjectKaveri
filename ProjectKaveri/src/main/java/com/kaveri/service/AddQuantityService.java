package com.kaveri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaveri.details.AddQuantityDetails;
import com.kaveri.models.Storage;
import com.kaveri.repository.StroageRepository;
import com.kaveri.response.QuantityResponse;

@Service
public class AddQuantityService {

	@Autowired
	private StroageRepository strRepo;

	public QuantityResponse AddQuantity(AddQuantityDetails details) {
		boolean flag = true;
		QuantityResponse response = new QuantityResponse();
		try {
			Storage str = strRepo.findByBrandName(details.getBrandname());
			if (details.getQuantity() >= 0) {
				str.setQuantity(str.getQuantity() + details.getQuantity());
				strRepo.save(str);
				response.setBrandname(details.getBrandname());
				response.setMessage(details.getQuantity() + " Kg added to the " + details.getBrandname() + " "
						+ str.getProductname());
				response.setStatus(flag);
			} else {
				flag = false;
				response.setBrandname(details.getBrandname());
				response.setMessage("Enter the Quantity is properly");
				response.setStatus(flag);
			}

		} catch (Exception e) {
			flag = false;
			response.setMessage("Enter the Brand Name Correctly");
			response.setStatus(flag);
			response.setBrandname(details.getBrandname());
		}
		return response;

	}

}
