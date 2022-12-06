package com.kaveri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaveri.models.CustomerHistory;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerHistory, Integer> {

	
}
