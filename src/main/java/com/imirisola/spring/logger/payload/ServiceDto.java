package com.imirisola.spring.logger.payload;

import java.util.Set;


import com.imirisola.spring.logger.model.StepsServices;

public class ServiceDto {
	

	  private String id;
	  private String name ; 
	  private String desc ; 
	  private String requirements ;
	  private Set<StepsServices> stepsServices ;
	  
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Set<StepsServices> getStepsServices() {
		return stepsServices;
	}
	public void setStepsServices(Set<StepsServices> stepsServices) {
		this.stepsServices = stepsServices;
	}
	  
	  
		
	  
}
