package com.imirisola.spring.logger.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "services"
)
public class Servicee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
	
	
	 @Column(name = "name", nullable = true)
	 @Lob
	 private String name;
	 
	 @Column(name = "desc", nullable = true)
	 @Lob
	 private String desc;
	 
	 @Column(name = "requirements", nullable = true)
	 @Lob
	 private String requirements;
	 
	 
	 @OneToMany(mappedBy = "servicee",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 @JsonManagedReference
	 private Set<StepService> stepsService ;

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

	public Set<StepService> getStepsService() {
		return stepsService;
	}

	public void setStepsService(Set<StepService> stepsService) {
		this.stepsService = stepsService;
	}
	 
	 

}
