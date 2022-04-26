package com.imirisola.spring.logger.service;

import com.imirisola.spring.logger.payload.ServiceDto;

public interface ElecServiceService {

	ServiceDto createService(ServiceDto serviceDto);
	
	ServiceDto getServices();
}
