package com.imirisola.spring.logger.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imirisola.spring.logger.payload.PropertyDto;
import com.imirisola.spring.logger.service.PropertyService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping()
public class PropertyController {
	
	private PropertyService propertyService;
	
	public PropertyController(PropertyService propertyService) {
		this.propertyService = propertyService ;
	}
	
//	@PostMapping("/api/property")
//	public Property createPropertyRequest(@RequestBody Property property){
//		Property propertyc = propertyService.creatPropertyRequest(property);
//		return propertyc ;
//	}
	
	
	@PostMapping("/api/property")
	public ResponseEntity<PropertyDto> createPropertyRequest(@RequestBody PropertyDto propertyDto){
		return new ResponseEntity<PropertyDto>(propertyService.creatPropertyRequest(propertyDto),HttpStatus.CREATED);
	}
}
