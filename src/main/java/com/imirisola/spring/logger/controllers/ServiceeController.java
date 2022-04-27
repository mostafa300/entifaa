package com.imirisola.spring.logger.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imirisola.spring.logger.payload.ServiceeDto;
import com.imirisola.spring.logger.service.ServiceeService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping()
public class ServiceeController {

	private ServiceeService service ;

	public ServiceeController(ServiceeService service) {
		this.service = service;
	}
	
	
	
	@PostMapping("/api/servicee")
	public ResponseEntity<ServiceeDto> createServicee(@RequestBody ServiceeDto serviceeDto ){
		return new ResponseEntity<ServiceeDto>(service.createServicee(serviceeDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/servicee")
	public List<ServiceeDto> getAllServicees(){
		return service.getAllServicee();
	}
	
//    // get post by id
//    @GetMapping("/{id}")
//    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id){
//        return ResponseEntity.ok(postService.getPostById(id));
//    }
	
	@GetMapping("/api/servicee/{id}")
	public ResponseEntity<ServiceeDto> getServiceById(@PathVariable(name = "id") long id){
		return ResponseEntity.ok(service.getServiceById(id));
	}
}
