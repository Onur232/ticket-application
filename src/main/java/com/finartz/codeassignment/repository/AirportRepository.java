package com.finartz.codeassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finartz.codeassignment.entity.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long>{

}
