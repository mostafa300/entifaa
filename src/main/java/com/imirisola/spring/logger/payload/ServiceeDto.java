package com.imirisola.spring.logger.payload;

import java.util.Set;

public class ServiceeDto {
	private  Long id ;
	private String name;
	private String desc;
	private String requirements;
	
	//private Set<OwnerBuildingDto> ownerBuildings ;
	
	// Relationship
	private Set<StepServiceDto> stepsService ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public Set<StepServiceDto> getStepsService() {
		return stepsService;
	}

	public void setStepsService(Set<StepServiceDto> stepsService) {
		this.stepsService = stepsService;
	}


	
}
