package com.finartz.codeassignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.finartz.codeassignment.entity.Airline;
import com.finartz.codeassignment.entity.Airport;
import com.finartz.codeassignment.service.AirlineService;
import com.finartz.codeassignment.service.AirportService;

@Controller
public class UrlMappingController {

	@Autowired
	AirlineService airlineService;
	
	@Autowired
	AirportService airportService;
	
	@RequestMapping(value = "/addAirline", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Airline addAirline(@RequestBody Airline airline) {
		return airlineService.addAirline(airline);
	}
	
	@RequestMapping(value = "/searchAirline", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Airline> searchAirline(@RequestParam int id) {
		return airlineService.searchAirlineById(id);
	}
	
	@RequestMapping(value = "/addAirport", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Airport addAirport(@RequestBody Airport airport) {
		return airportService.addAirport(airport);
	}
	
	@RequestMapping(value = "/searchAirport", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Optional<Airport> searchAirport(@RequestParam int id) {
		return airportService.searchByAirportId(id);
	}
}
