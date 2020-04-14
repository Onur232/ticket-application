package com.finartz.codeassignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.finartz.codeassignment.entity.Airline;
import com.finartz.codeassignment.repository.AirlineRepository;

@Service
public class AirlineService {
	
	@Autowired
	AirlineRepository airlineRepository;
	
	public Airline addAirline(@RequestBody Airline airline) {
		return airlineRepository.save(airline);
	}
	
	public Optional<Airline> searchAirlineById(long id) {
		return airlineRepository.findById(id);
	}

}
