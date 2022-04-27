package com.imirisola.spring.logger.payload;
import java.util.Date;
import java.util.Set;

import com.imirisola.spring.logger.model.Attachment;

import lombok.Data;

@Data
public class PropertyDto {
	private  Long id ;
	 private String authority_name; 
	 private String sector; 
	 private String city; 
	 private String representative; 
	 private String mobile; 
	 private String phone; 
	 private String email; 
	 private String explanation; 
	 private String special_requests; 
	 private String type ; 
//	 private Date created_on ; 
	 private Date created_at ; 
	 private String status ;
	 
	 // RelationShip
	 private LandDto land ;
	 private BuildingDto building ;
	 private Set<OwnerBuildingDto> ownerBuildings ;
	 private Set<Attachment> attachments;

	 
	 
	 
	 
//	Setter and Getter for each field 
	
	public String getAuthority_name() {
		return authority_name;
	}
	public void setAuthority_name(String authority_name) {
		this.authority_name = authority_name;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRepresentative() {
		return representative;
	}
	public void setRepresentative(String representative) {
		this.representative = representative;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getSpecial_requests() {
		return special_requests;
	}
	public void setSpecial_requests(String special_requests) {
		this.special_requests = special_requests;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	/*
	 * public Date getCreated_on() { return created_on; } public void
	 * setCreated_on(Date created_on) { this.created_on = created_on; }
	 */
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LandDto getLand() {
		return land;
	}
	public void setLand(LandDto land) {
		this.land = land;
	}
	public BuildingDto getBuilding() {
		return building;
	}
	public void setBuilding(BuildingDto building) {
		this.building = building;
	}
	public Set<OwnerBuildingDto> getOwnerBuildings() {
		return ownerBuildings;
	}
	public void setOwnerBuildings(Set<OwnerBuildingDto> ownerBuildings) {
		this.ownerBuildings = ownerBuildings;
	}
	public Set<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(Set<Attachment> attachments) {
		this.attachments = attachments;
	}
	
	
}
