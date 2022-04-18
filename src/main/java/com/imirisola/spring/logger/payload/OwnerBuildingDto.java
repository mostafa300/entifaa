package com.imirisola.spring.logger.payload;

public class OwnerBuildingDto {

	 private  Long id ;
	    private PropertyDto PropertyDto;
		private String property_info; 
		private String property_name; 
		private String usage_type; 
		private String location; 
		private String owner; 
		private String instrument_no; 
		private String total_area; 
		private String building_area; 
		private String rental; 
		private String employees_info; 
		private String employees_no; 
		private String capacity; 
		private String coordinates; 
		private String notes;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public PropertyDto getPropertyDto() {
			return PropertyDto;
		}
		public void setPropertyDto(PropertyDto propertyDto) {
			PropertyDto = propertyDto;
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
