package com.imirisola.spring.logger.payload;



import com.imirisola.spring.logger.model.ElecService;


public class StepsServicesDto {

	private String id;
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
