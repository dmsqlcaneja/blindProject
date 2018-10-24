package com.blindproject.blind.entity;

//회사명
public class Company {

	// 아이디
	private int id;

	// 회사명
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company() {
		super();
	}

	public Company(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
