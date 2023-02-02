package com.simeon.h2demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TODO {

	@Id
	private Integer id;
	private String name;
	private String department;
	
	public TODO()
	{
		
	}

	public TODO(Integer id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
