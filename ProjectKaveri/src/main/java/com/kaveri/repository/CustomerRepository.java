package com.kaveri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kaveri.models.CustomerHistory;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerHistory, Integer> {

	@Query("SELECT c FROM CustomerHistory c ORDER BY id DESC")
	public List<CustomerHistory> findAllcustomerHistory();
}
