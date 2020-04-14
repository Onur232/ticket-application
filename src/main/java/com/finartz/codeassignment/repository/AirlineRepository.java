package com.finartz.codeassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finartz.codeassignment.entity.Airline;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Long> {
	
}
