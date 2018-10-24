package com.blindproject.blind.entity;

//채용구분(인턴, 계약직, 정규직) 
public class RecruitDivision {

	// 아이디
	private int id;

	// 값(인턴, 계약직, 정규직)
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

	// Recruitdivision 모델 복사
	public void CopyData(RecruitDivision param) {
		this.id = param.getId();
		this.value = param.getValue();
	}

	public RecruitDivision() {
		super();
	}

	public RecruitDivision(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
}
