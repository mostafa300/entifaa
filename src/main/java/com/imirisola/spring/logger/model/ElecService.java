package com.imirisola.spring.logger.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "services")
public class ElecService {
	  @Id
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String id;
	  
	  private String name ; 
	  private String desc ; 
	  private String requirements ;
	  
	 @OneToMany(mappedBy = "elecService",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 @JsonManagedReference
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
