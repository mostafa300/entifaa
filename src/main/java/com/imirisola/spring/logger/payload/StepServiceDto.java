package com.imirisola.spring.logger.payload;

public class StepServiceDto {
	
	private  Long id ;
	private ServiceeDto serviceeDto ;
	private String title ; 
	private String desc ;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ServiceeDto getServiceeDto() {
		return serviceeDto;
	}
	public void setServiceeDto(ServiceeDto serviceeDto) {
		this.serviceeDto = serviceeDto;
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
