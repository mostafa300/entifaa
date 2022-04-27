package com.imirisola.spring.logger.service.imp;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.imirisola.spring.logger.model.Servicee;
import com.imirisola.spring.logger.model.StepService;
import com.imirisola.spring.logger.payload.ServiceeDto;
import com.imirisola.spring.logger.repository.ServiceeRepository;
import com.imirisola.spring.logger.repository.StepServiceRepository;
import com.imirisola.spring.logger.service.ServiceeService;

@Service
public class ServiceeImp implements ServiceeService{

	private ServiceeRepository serviceeRepository ;
	private StepServiceRepository stepServiceRepository ;
	private ModelMapper mapper;
	
	
	
	
	public ServiceeImp(ServiceeRepository serviceeRepository, StepServiceRepository stepServiceRepository,
			ModelMapper mapper) {
		this.serviceeRepository = serviceeRepository;
		this.stepServiceRepository = stepServiceRepository;
		this.mapper = mapper;
	}


	@Override
	public ServiceeDto createServicee(ServiceeDto serviceeDto) {
		
		Servicee servicee = serviceeMapToModel(serviceeDto);
		Set<StepService> StepServices = servicee.getStepsService() ;
		
		for(StepService StepServices1 : StepServices) {
			StepServices1.setServicee(servicee);
		}
	
		Servicee newServicee = serviceeRepository.save(servicee);
		ServiceeDto newServiceDto = serviceeMapToDto(newServicee);
		
		return newServiceDto;
	}

	
//	 @Override
//	    public List<PostDto> getAllPosts() {
//	        List<Post> posts = postRepository.findAll();
//	        return posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());
//	    }
	
	@Override
	public List<ServiceeDto> getAllServicee() {
		List<Servicee> servicees= serviceeRepository.findAll();
		return servicees.stream().map(servicee -> serviceeMapToDto(servicee)).collect(Collectors.toList());
	}
	
	
	// Convert DTO to Entity Model 
	private Servicee serviceeMapToModel(ServiceeDto serviceeDto) {
		Servicee servicee = mapper.map(serviceeDto, Servicee.class);
		return servicee ;
	}
	
	// Convert Model Entity to DTO 
	private ServiceeDto serviceeMapToDto(Servicee servicee) {
		ServiceeDto serviceeDto = mapper.map(servicee, ServiceeDto.class);
		return serviceeDto ;
	}



}
