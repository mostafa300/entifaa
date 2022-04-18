package com.imirisola.spring.logger.service.imp;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.imirisola.spring.logger.model.Building;
import com.imirisola.spring.logger.model.Land;
import com.imirisola.spring.logger.model.OwnerBuilding;
import com.imirisola.spring.logger.model.Property;
import com.imirisola.spring.logger.payload.LandDto;
import com.imirisola.spring.logger.payload.PropertyDto;
import com.imirisola.spring.logger.repository.BuildingRepository;
import com.imirisola.spring.logger.repository.LandRepository;
import com.imirisola.spring.logger.repository.OwnerBuildingRepository;
import com.imirisola.spring.logger.repository.PropertyRepository;
import com.imirisola.spring.logger.service.PropertyService;

@Service
public class PropertyServiceImp implements PropertyService{

	private PropertyRepository propertyRepository ;
	private BuildingRepository buildingRepository ;
	private LandRepository landRepository ; 
	private OwnerBuildingRepository ownerBuildingRepository;
	private ModelMapper mapper;
	

	public PropertyServiceImp(PropertyRepository propertyRepository,BuildingRepository buildingRepository, LandRepository landRepository,OwnerBuildingRepository ownerBuildingRepository ,ModelMapper mapper) {
		this.propertyRepository = propertyRepository;
		this.buildingRepository = buildingRepository ;
		this.landRepository     = landRepository ;
		this.ownerBuildingRepository = ownerBuildingRepository ;
		this.mapper = mapper;
	}

	

//	@Override
//	public Property creatPropertyRequest(Property property) {
//		
//		Land land = property.getLand();
//		land.setProperty(property);
//		property.setLand(land);
//		
//		Property nweProperty = propertyRepository.save(property);
//		return nweProperty;
//	}
	
	
	@Override
	public PropertyDto creatPropertyRequest(PropertyDto propertyDto) {
		// TODO Auto-generated method stub
		Property property = propertyMapToEntityModel(propertyDto);
		
		
		//private Set<OwnerBuilding> ownerBuildings ;
		Land land = property.getLand();
		Building building = property.getBuilding();
		

		Set<OwnerBuilding> ownerBuildings = property.getOwnerBuildings();
		if(land != null) {
		  land.setProperty(property);
		  property.setLand(land);
		}
		
		if(building != null) {
		   building.setProperty(property);
		   property.setBuilding(building);
		}
		
		for(OwnerBuilding ownerBuilding1 : ownerBuildings) {
			ownerBuilding1.setProperty(property);
		}
		
	
		
		property.setOwnerBuildings(ownerBuildings);
	
		
		Property newProperty = propertyRepository.save(property);
		PropertyDto proDto = propertyMapToDTO(newProperty);
		
		return proDto;
	}
	
	// Convert DTO to Entity Model 
	private Property propertyMapToEntityModel(PropertyDto propertyDto) {
		Property property = mapper.map(propertyDto, Property.class);
		return property ;
	}
	// Convert Model Entity to DTO 
	private PropertyDto propertyMapToDTO(Property property) {
		PropertyDto propertyDto = mapper.map(property, PropertyDto.class);
		return propertyDto ;
	}
	
	
	// Convert DTO Land to Entity Model 
	private Land landMapToEntityModel(LandDto landDto) {
		Land land = mapper.map(landDto, Land.class);
		return land ;
	}
	// Convert Model Entity to DTO 
	private LandDto landMapToDTO(Land land) {
		LandDto landDto = mapper.map(land, LandDto.class);
		return landDto ;
	}


	
}
