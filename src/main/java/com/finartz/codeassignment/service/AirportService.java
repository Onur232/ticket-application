package com.finartz.codeassignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.finartz.codeassignment.entity.Airport;
import com.finartz.codeassignment.repository.AirportRepository;

@Service
public class AirportService {
	
	@Autowired
	AirportRepository airportRepository;
	
	public Airport addAirport(@RequestBody Airport airport) {
		return airportRepository.save(airport);
	}
	
	public Optional<Airport> searchByAirportId(long id) {
		return airportRepository.findById(id);
	}
	
	

}
