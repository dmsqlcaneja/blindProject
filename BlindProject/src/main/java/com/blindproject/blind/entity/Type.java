package com.blindproject.blind.entity;

//전형구분(진행중, 완료) 
public class Type {

	// 아이디
	private Integer id;

	// 값
	private String value;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	// Type 모델 복사
	public void CopyData(Type param) {
		this.id = param.getId();
		this.value = param.getValue();
	}

	public Type() {
		super();
	}

	public Type(Integer id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	
}
