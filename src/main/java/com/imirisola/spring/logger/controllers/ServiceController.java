package com.imirisola.spring.logger.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imirisola.spring.logger.payload.PropertyDto;
import com.imirisola.spring.logger.payload.ServiceDto;
import com.imirisola.spring.logger.service.ElecServiceService;


@RestController
public class ServiceController {

	private ElecServiceService elecServiceService ;

	public ServiceController(ElecServiceService elecServiceService) {
		this.elecServiceService = elecServiceService;
	}
	
	
//	@PostMapping("/api/property")
//	public ResponseEntity<PropertyDto> createPropertyRequest(@RequestBody PropertyDto propertyDto){
//		return new ResponseEntity<PropertyDto>(propertyService.creatPropertyRequest(propertyDto),HttpStatus.CREATED);
//	}
	
//	@PostMapping("/api/service")
//	public ResponseEntity<ServiceDto> createPropertyRequest(@RequestBody ServiceDto serviceDto){
//		return new ResponseEntity<ServiceDto>(elecServiceService.createService(serviceDto),HttpStatus.CREATED);
//	}
	@PostMapping("/api/service")
	public ResponseEntity<ServiceDto> createProperty(@RequestBody ServiceDto serviceDto){
		return new ResponseEntity<ServiceDto>(elecServiceService.createService(serviceDto),HttpStatus.CREATED);
	}
	
}
