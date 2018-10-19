package com.blindproject.blind.entity;

//Role 
public class Role {

	// name
	private String name;

	// description
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Role 모델 복사
	public void CopyData(Role param) {
		this.name = param.getName();
		this.description = param.getDescription();
	}
}