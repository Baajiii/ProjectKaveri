package com.kaveri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kaveri.models.Storage;

@Repository
public interface StroageRepository extends JpaRepository<Storage, Integer> {

	
}
