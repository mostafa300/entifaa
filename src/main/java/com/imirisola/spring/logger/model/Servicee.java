package com.imirisola.spring.logger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	 @Column(name = "name", nullable = false)
	 private String name;
	 
	 @Column(name = "desc", nullable = false)
	 private String desc;
	 
	 @Column(name = "requirements", nullable = false)
	 private String requirements;

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
	 
	 

}
