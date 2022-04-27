package com.imirisola.spring.logger.service;

import java.util.List;

import com.imirisola.spring.logger.payload.PropertyDto;
import com.imirisola.spring.logger.payload.ServiceeDto;

public interface ServiceeService {

	//List<PostDto> getAllPosts();
	ServiceeDto createServicee(ServiceeDto serviceeDto);
	
	List<ServiceeDto> getAllServicee();
	
//	 PostDto getPostById(long id);
	ServiceeDto getServiceById(long id);
}
