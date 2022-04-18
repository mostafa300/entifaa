package com.imirisola.spring.logger.service;

import com.imirisola.spring.logger.model.Property;
import com.imirisola.spring.logger.payload.PropertyDto;

public interface PropertyService {
	
	PropertyDto creatPropertyRequest(PropertyDto  propertyDto );
	//Property creatPropertyRequest(Property  property );
	
}
