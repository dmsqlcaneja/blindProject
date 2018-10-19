package com.blindproject.blind.entity;

public class Classes {

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

	// Classes 모델 복사
	public void CopyData(Classes param) {
		this.id = param.getId();
		this.value = param.getValue();
	}
}