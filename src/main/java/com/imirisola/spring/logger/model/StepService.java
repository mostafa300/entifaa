package com.imirisola.spring.logger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
        name = "steps_service" //, uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class StepService {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servicee_id", referencedColumnName = "id")
    private Servicee servicee ;

	@Column(name = "title", nullable = true)
	@Lob
	private String title ; 
	
	@Column(name = "desc", nullable = true)
	@Lob
	private String desc ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Servicee getServicee() {
		return servicee;
	}

	public void setServicee(Servicee servicee) {
		this.servicee = servicee;
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
