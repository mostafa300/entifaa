package com.imirisola.spring.logger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
        name = "Attchment_property" //, uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Attachment {
	   @Id
	   @GeneratedValue(generator = "uuid")
	   @GenericGenerator(name = "uuid", strategy = "uuid2")
	   private String id;
	
	   @ManyToOne(fetch = FetchType.LAZY)
       @JoinColumn(name = "property_id", referencedColumnName = "id")
	   private Property property;
	
	   @Column(name = "name", nullable = false)
	   private String name;
	   
	   @Column(name = "type", nullable = false)
	   private String type;
	   
	   @Lob
	   @Column(name = "content", nullable = false)
	   private String content ;
	   

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	   
	   
}
