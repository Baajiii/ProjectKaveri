package com.kaveri.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kaveri.models.Storage;

@Repository
public interface StroageRepository extends JpaRepository<Storage, Integer> {


	@Query("SELECT s FROM Storage s WHERE s.brandname=?1")
	public  Storage findByBrandName(String brandname);
	
}
