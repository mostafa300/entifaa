package com.imirisola.spring.logger.service.imp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.imirisola.spring.logger.model.Attachment;
import com.imirisola.spring.logger.model.Building;
import com.imirisola.spring.logger.model.Land;
import com.imirisola.spring.logger.model.OwnerBuilding;
import com.imirisola.spring.logger.model.Property;
import com.imirisola.spring.logger.payload.LandDto;
import com.imirisola.spring.logger.payload.PropertyCpiDto;
import com.imirisola.spring.logger.payload.PropertyDto;
import com.imirisola.spring.logger.repository.AttachmentRepository;
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
	private AttachmentRepository attachmentRepository;
	private ModelMapper mapper;
	

	public PropertyServiceImp(PropertyRepository propertyRepository,BuildingRepository buildingRepository, LandRepository landRepository,OwnerBuildingRepository ownerBuildingRepository ,AttachmentRepository attachmentRepository,ModelMapper mapper) {
		this.propertyRepository = propertyRepository;
		this.buildingRepository = buildingRepository ;
		this.landRepository     = landRepository ;
		this.ownerBuildingRepository = ownerBuildingRepository ;
		this.attachmentRepository = attachmentRepository ;
		this.mapper = mapper;
	}


	
	@Override
	public PropertyDto creatPropertyRequest(PropertyDto propertyDto) {
		// TODO Auto-generated method stub
		Property property = propertyMapToEntityModel(propertyDto);
		
		
		//private Set<OwnerBuilding> ownerBuildings ;
		Land land = property.getLand();
		Building building = property.getBuilding(); 
	
		

		Set<OwnerBuilding> ownerBuildings = property.getOwnerBuildings();
		Set<Attachment> attachments = property.getAttachments();
		
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
		
		for(Attachment attachment1 : attachments) {
			attachment1.setProperty(property);
		}
	
		
		property.setOwnerBuildings(ownerBuildings);
	
		
		//Property newProperty = propertyRepository.save(property);
		//PropertyDto proDto = propertyMapToDTO(newProperty);
		
		
		// send request to CPI 
		RestTemplate restTemplate = new RestTemplate();
		//String result = restTemplate.getForObject(url, String.class);
		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		Map map = new HashMap<String, String>();
		map.put("Content-Type", "application/json");
		map.put("Authorization", "Basic UzAwMjEwMTQ3OTE6LigtaHZMTDk7Yk0mOilG");
		headers.setAll(map);
		
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("Name", property.getAuthority_name().length() > 1 ? property.getAuthority_name() : "name for testing");
		data.put("ProcessingTypeCode", "ProcessingTypeCode");
		data.put("CustomerID", "CustomerID");
		data.put("ExternalContactID", "ExternalContactID");
		data.put("ContactID", property.getEmail().length() > 1 ? property.getEmail() : "ContactID" );
		data.put("Branch_Manager_KUT", land.getWorkers_no().length() > 1 ? land.getWorkers_no() : "workers_no");
		data.put("Building_Number_KUT", land.getFlats_buildings().length() > 1 ? land.getFlats_buildings() : "Building_Number_KUT");
		data.put("Building_Service_KUT", "Building_Service_KUT");
		data.put("Building_Store_KUT", "Building_Store_KUT");
		data.put("Building_flat_KUT", "Building_flat_KUT");
		data.put("Electric_room_KUT", "Electric_room_KUT");
		data.put("Emp_Nooffice_KUT", "Emp_Nooffice_KUT");
		data.put("Emp_Office_KUT", "Emp_Office_KUT");
		data.put("Emp_Qty_KUT", "Emp_Qty_KUT");
		data.put("Expected_Jobs_KUT", "Expected_Jobs_KUT");
		data.put("Location_KUT", land.getCoordinates().length() > 1 ? land.getCoordinates() : "Location_KUT");
		data.put("Main_Building_KUT", "Main_Building_KUT");
		data.put("Parking_KUT", "Parking_KUT");
		data.put("Project_number_KUT", "Project_number_KUT");
		data.put("Project_value_KUT", "Project_value_KUT");
		data.put("Request_Purpose_KUT", land.getPurpose().length() > 1 ? land.getPurpose() : "Request_Purpose_KUT");
		data.put("Security_Building_KUT", "Security_Building_KUT");
		data.put("Supervisor_Jobs_KUT", "Supervisor_Jobs_KUT");
		
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("properties", data);		
		
		Map<String, Object> data3 = new HashMap<String, Object>();
		data3.put("PropertyRequest", data2);		
		
		
		HttpEntity<?> request = new HttpEntity<>(data3, headers);
		String url = "https://e650132-iflmap.hcisbt.sa1.hana.ondemand.com/http/PORTAL/C4C/Create_New_Ticket";
		ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
		int statusReq = response.getStatusCodeValue();
		String body = response.getBody().toString();
		String[] spl1 = body.split("<ID>");
		String[] spl2 = spl1[1].toString().split("</ID>");
		
		
	
		property.setStatus(spl2[0]);
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
