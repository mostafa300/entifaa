package com.imirisola.spring.logger.model;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "ownerBuilding_requests" //, uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class OwnerBuilding {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    private Property property;
	
	@Column(name = "property_info", nullable = false)
	private String property_info; 
	
	@Column(name = "property_name", nullable = false)
	private String property_name; 
	
	@Column(name = "usage_type", nullable = false)
	private String usage_type; 
	
	@Column(name = "location", nullable = false)
	private String location; 
	
	@Column(name = "owner", nullable = false)
	private String owner; 
	
	@Column(name = "instrument_no", nullable = false)
	private String instrument_no; 
	
	@Column(name = "total_area", nullable = false)
	private String total_area; 
	
	@Column(name = "building_area", nullable = false)
	private String building_area; 
	
	@Column(name = "rental", nullable = false)
	private String rental; 
	
	@Column(name = "employees_info", nullable = false)
	private String employees_info; 
	
	@Column(name = "employees_no", nullable = false)
	private String employees_no; 
	
	@Column(name = "capacity", nullable = false)
	private String capacity; 
	
	@Column(name = "coordinates", nullable = false)
	private String coordinates; 
	
	@Column(name = "notes", nullable = false)
	private String notes;

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

	public String getProperty_info() {
		return property_info;
	}

	public void setProperty_info(String property_info) {
		this.property_info = property_info;
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public String getUsage_type() {
		return usage_type;
	}

	public void setUsage_type(String usage_type) {
		this.usage_type = usage_type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getInstrument_no() {
		return instrument_no;
	}

	public void setInstrument_no(String instrument_no) {
		this.instrument_no = instrument_no;
	}

	public String getTotal_area() {
		return total_area;
	}

	public void setTotal_area(String total_area) {
		this.total_area = total_area;
	}

	public String getBuilding_area() {
		return building_area;
	}

	public void setBuilding_area(String building_area) {
		this.building_area = building_area;
	}

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		this.rental = rental;
	}

	public String getEmployees_info() {
		return employees_info;
	}

	public void setEmployees_info(String employees_info) {
		this.employees_info = employees_info;
	}

	public String getEmployees_no() {
		return employees_no;
	}

	public void setEmployees_no(String employees_no) {
		this.employees_no = employees_no;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
