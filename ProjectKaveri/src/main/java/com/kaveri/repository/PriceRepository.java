package com.kaveri.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kaveri.models.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price,Integer>{

	@Query("SELECT p FROM Price p WHERE p.brandname=?1 ORDER BY id DESC")
	public List<Price> findByDateAndName(String brandname);
	
	@Query("SELECT p FROM Price p WHERE p.date=?1")
	public List<Price> findBydate(LocalDate date);
}
