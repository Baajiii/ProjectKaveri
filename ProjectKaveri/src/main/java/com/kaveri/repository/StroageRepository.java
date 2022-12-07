package com.kaveri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kaveri.models.Storage;

@Repository
public interface StroageRepository extends JpaRepository<Storage, Integer> {

	@Query("FROM Storage u WHERE u.Brandname = ?1")
	public  Storage findByBrandName(String brandname);
}
