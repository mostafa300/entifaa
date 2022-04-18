package com.imirisola.spring.logger.model;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "land_requests" //, uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Land {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "property_id", referencedColumnName = "id")
	private Property property ;
	
	@Column(name = "purpose", nullable = false)
	private String purpose; 
	
	@Column(name = "location", nullable = false)
	private String location; 
	
	@Column(name = "space", nullable = false)
	private String space; 
	
	@Column(name = "coordinates", nullable = true)
	private String coordinates; 
	
	@Column(name = "buildings_num", nullable = false)
	private String buildings_num; 
	
	@Column(name = "flats_buildings", nullable = false)
	private String flats_buildings; 
	
	@Column(name = "workers_no", nullable = false)
	private String workers_no; 
	
	@Column(name = "project_info", nullable = false)
	private String project_info;
	
	@Column(name = "project_name", nullable = false)
	private String project_name;
	
	@Column(name = "project_budget", nullable = false)
	private String project_budget;
	
	@Column(name = "amount_approved", nullable = false)
	private String amount_approved;
	
	@Column(name = "projct_start_date", nullable = false)
	private String projct_start_date;
	
	@Column(name = "projct_end_date", nullable = false)
	private String projct_end_date;
	
	


	//	Setter and Getter for each field 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getBuildings_num() {
		return buildings_num;
	}

	public void setBuildings_num(String buildings_num) {
		this.buildings_num = buildings_num;
	}

	public String getFlats_buildings() {
		return flats_buildings;
	}

	public void setFlats_buildings(String flats_buildings) {
		this.flats_buildings = flats_buildings;
	}

	public String getWorkers_no() {
		return workers_no;
	}

	public void setWorkers_no(String workers_no) {
		this.workers_no = workers_no;
	}

	public String getProject_info() {
		return project_info;
	}

	public void setProject_info(String project_info) {
		this.project_info = project_info;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_budget() {
		return project_budget;
	}

	public void setProject_budget(String project_budget) {
		this.project_budget = project_budget;
	}

	public String getAmount_approved() {
		return amount_approved;
	}

	public void setAmount_approved(String amount_approved) {
		this.amount_approved = amount_approved;
	}

	public String getProjct_start_date() {
		return projct_start_date;
	}

	public void setProjct_start_date(String projct_start_date) {
		this.projct_start_date = projct_start_date;
	}

	public String getProjct_end_date() {
		return projct_end_date;
	}

	public void setProjct_end_date(String projct_end_date) {
		this.projct_end_date = projct_end_date;
	}

}
