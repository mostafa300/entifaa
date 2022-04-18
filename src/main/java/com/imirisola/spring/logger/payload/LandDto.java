package com.imirisola.spring.logger.payload;

public class LandDto {
	
	private  Long id ;
	private PropertyDto propertyDto ;
	private String purpose; 
	private String location; 
	private String space; 
	private String coordinates; 
	private String buildings_num; 
	private String flats_buildings; 
	private String workers_no; 
	private String project_info;
	private String project_name;
	private String project_budget;
	private String amount_approved;
	private String projct_start_date;
	private String projct_end_date;
	
	
//	Setter and Getter for each field 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PropertyDto getPropertyDto() {
		return propertyDto;
	}
	public void setPropertyDto(PropertyDto propertyDto) {
		this.propertyDto = propertyDto;
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
