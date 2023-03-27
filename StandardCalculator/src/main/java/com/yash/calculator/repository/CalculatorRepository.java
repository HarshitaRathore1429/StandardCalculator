package com.yash.calculator.repository;

import org.springframework.transaction.annotation.Transactional;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.calculator.model.Memory;

@Repository
public interface CalculatorRepository  extends CrudRepository<Memory, Integer>{
	@Transactional
	@Modifying
	@Query(value="delete from memory where saved=:mem")
	public void deleteBySaved(String mem);
	
}
