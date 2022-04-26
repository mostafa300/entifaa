package com.imirisola.spring.logger.service.imp;

import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.imirisola.spring.logger.model.ElecService;
import com.imirisola.spring.logger.model.StepsServices;
import com.imirisola.spring.logger.payload.ServiceDto;
import com.imirisola.spring.logger.repository.ElecServiceRepository;
import com.imirisola.spring.logger.repository.StepsServiveRepository;
import com.imirisola.spring.logger.service.ElecServiceService;


@Service
public class ElecServiceServiceImp implements ElecServiceService {

	private ElecServiceRepository elecServiceRepository ;
	private StepsServiveRepository stepsServiveRepository;
	private ModelMapper mapper;
	
	
	public ElecServiceServiceImp(ElecServiceRepository elecServiceRepository,
			StepsServiveRepository stepsServiveRepository, ModelMapper mapper) {
		this.elecServiceRepository = elecServiceRepository;
		this.stepsServiveRepository = stepsServiveRepository;
		this.mapper = mapper;
	}

	@Override
	public ServiceDto createService(ServiceDto serviceDto) {
		
		ElecService service = serviceMapToEntityModel(serviceDto);
		Set<StepsServices> stepsServices = service.getStepsServices();
		
		for(StepsServices stepsService : stepsServices) {
			stepsService.setElecService(service);
		}
		
		service.setStepsServices(stepsServices);
	
		ElecService newService = elecServiceRepository.save(service);
		ServiceDto serviceDto2 = serviceMapToDto(newService);
		
		return serviceDto2;
	}

	@Override
	public ServiceDto getServices() {
		// TODO Auto-generated method stub
		return null;
	}

	
	// Convert DTO to Entity Model 
	private ElecService serviceMapToEntityModel(ServiceDto serviceDto) {
		ElecService service = mapper.map(serviceDto, ElecService.class);
		return service ;
	}
	// Convert Model Entity to DTO 
	private ServiceDto serviceMapToDto(ElecService service) {
		ServiceDto serviceDto = mapper.map(service, ServiceDto.class);
		return serviceDto ;
	}
}
