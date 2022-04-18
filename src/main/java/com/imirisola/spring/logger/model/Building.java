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
        name = "building_requests" //, uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Building {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "property_id", referencedColumnName = "id")
	private Property property ;
	
	@Column(name = "visitor_info", nullable = false)
	private String visitor_info; 
	
	@Column(name = "employees_no", nullable = false)
	private String employees_no; 
	
	@Column(name = "branch_manager", nullable = false)
	private String branch_manager; 
	
	@Column(name = "supervisory_jobs", nullable = false)
	private String supervisory_jobs; 
	
	@Column(name = "office_emp_num", nullable = false)
	private String office_emp_num;
	
	@Column(name = "w_office_emp_num", nullable = false)
	private String w_office_emp_num;
	
	@Column(name = "expected_jobs", nullable = false)
	private String expected_jobs;
	
	@Column(name = "total_num", nullable = false)
	private String total_num;
	
	@Column(name = "visitors", nullable = false)
	private String visitors;
	
	@Column(name = "average_visitors", nullable = false)
	private String average_visitors;
	
	@Column(name = "area_need", nullable = false)
	private String area_need;
	
	@Column(name = "blank_num", nullable = false)
	private String blank_num;
	
	@Column(name = "main_building", nullable = false)
	private String main_building;
	
	@Column(name = "service_building", nullable = false)
	private String service_building;
	
	@Column(name = "store_building", nullable = false)
	private String store_building;
	
	@Column(name = "guard_building", nullable = false)
	private String guard_building;
	
	@Column(name = "electric_building", nullable = false)
	private String electric_building;
	
	
	@Column(name = "situations", nullable = false)
	private String situations;


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


	public String getVisitor_info() {
		return visitor_info;
	}


	public void setVisitor_info(String visitor_info) {
		this.visitor_info = visitor_info;
	}


	public String getBranch_manager() {
		return branch_manager;
	}


	public void setBranch_manager(String branch_manager) {
		this.branch_manager = branch_manager;
	}


	public String getSupervisory_jobs() {
		return supervisory_jobs;
	}


	public void setSupervisory_jobs(String supervisory_jobs) {
		this.supervisory_jobs = supervisory_jobs;
	}


	public String getOffice_emp_num() {
		return office_emp_num;
	}


	public void setOffice_emp_num(String office_emp_num) {
		this.office_emp_num = office_emp_num;
	}


	public String getW_office_emp_num() {
		return w_office_emp_num;
	}


	public void setW_office_emp_num(String w_office_emp_num) {
		this.w_office_emp_num = w_office_emp_num;
	}


	public String getExpected_jobs() {
		return expected_jobs;
	}


	public void setExpected_jobs(String expected_jobs) {
		this.expected_jobs = expected_jobs;
	}


	public String getTotal_num() {
		return total_num;
	}


	public void setTotal_num(String total_num) {
		this.total_num = total_num;
	}


	public String getVisitors() {
		return visitors;
	}


	public void setVisitors(String visitors) {
		this.visitors = visitors;
	}


	public String getAverage_visitors() {
		return average_visitors;
	}


	public void setAverage_visitors(String average_visitors) {
		this.average_visitors = average_visitors;
	}


	public String getArea_need() {
		return area_need;
	}


	public void setArea_need(String area_need) {
		this.area_need = area_need;
	}


	public String getBlank_num() {
		return blank_num;
	}


	public void setBlank_num(String blank_num) {
		this.blank_num = blank_num;
	}


	public String getMain_building() {
		return main_building;
	}


	public void setMain_building(String main_building) {
		this.main_building = main_building;
	}


	public String getService_building() {
		return service_building;
	}


	public void setService_building(String service_building) {
		this.service_building = service_building;
	}


	public String getStore_building() {
		return store_building;
	}


	public void setStore_building(String store_building) {
		this.store_building = store_building;
	}


	public String getGuard_building() {
		return guard_building;
	}


	public void setGuard_building(String guard_building) {
		this.guard_building = guard_building;
	}


	public String getElectric_building() {
		return electric_building;
	}


	public void setElectric_building(String electric_building) {
		this.electric_building = electric_building;
	}


	public String getSituations() {
		return situations;
	}


	public void setSituations(String situations) {
		this.situations = situations;
	}


	public String getEmployees_no() {
		return employees_no;
	}


	public void setEmployees_no(String employees_no) {
		this.employees_no = employees_no;
	}

}
