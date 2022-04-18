package com.imirisola.spring.logger.model;

import lombok.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "property_requests"//, uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Property {
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private  Long id ;
	 
	 @Column(name = "authority_name", nullable = false)
	 private String authority_name; 
	 
	 @Column(name = "sector", nullable = false)
	 private String sector; 
	 
	 @Column(name = "city", nullable = false)
	 private String city; 
	 
	 @Column(name = "representative", nullable = false)
	 private String representative; 
	 

	@Column(name = "mobile", nullable = false)
	 private String mobile; 
	 
	 @Column(name = "phone", nullable = false)
	 private String phone; 
	 
	 @Column(name = "email", nullable = false)
	 private String email; 
	 
	 @Column(name = "explanation", nullable = false)
	 private String explanation; 
	 
	 @Column(name = "special_requests", nullable = false)
	 private String special_requests; 
	 
	 @Column(name = "type ", nullable = false)
	 private String type ; 
	 
	 
	 @Column(name = "created_at", nullable = true)
	 private Date created_at ; 
	 
	 @Column(name = "status", nullable = false)
	 private String status ;
	 
	 @OneToOne(mappedBy = "property",cascade = CascadeType.ALL, orphanRemoval = true)
	 @JsonManagedReference
	 private Land land ;
	 
	 @OneToOne(mappedBy = "property",cascade = CascadeType.ALL, orphanRemoval = true)
	 @JsonManagedReference
	 private Building building; 
	 
	 @OneToMany(mappedBy = "property",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 @JsonManagedReference
	 private Set<OwnerBuilding> ownerBuildings ;
	 
	


	//		Setter and Getter for each field 
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Land getLand() {
	     return land;
     }

	public void setLand(Land land) {
		this.land = land;
	}
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

	public Set<OwnerBuilding> getOwnerBuildings() {
		return ownerBuildings;
	}

	public void setOwnerBuildings(Set<OwnerBuilding> ownerBuildings) {
		this.ownerBuildings = ownerBuildings;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}
}
