package com.imirisola.spring.logger.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "steps_service")
public class StepsServices {

	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "elecService_id", referencedColumnName = "id")
    private ElecService elecService;
	
	private String title ; 
	
	private String desc ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ElecService getElecService() {
		return elecService;
	}

	public void setElecService(ElecService elecService) {
		this.elecService = elecService;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	
	
}
