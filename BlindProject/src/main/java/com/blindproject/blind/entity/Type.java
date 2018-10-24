package com.blindproject.blind.entity;

//전형구분(진행중, 완료)
public class Type {

	// 아이디
	private int id;

	// 값(진행중, 완료)
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Type() {
		super();
	}

	public Type(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

}
