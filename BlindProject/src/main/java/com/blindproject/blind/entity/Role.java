package com.blindproject.blind.entity;

//권한 설정
public class Role {

	// 권한명
	private String name;

	// ???????????
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

	public Role() {
		super();
	}

	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

}
