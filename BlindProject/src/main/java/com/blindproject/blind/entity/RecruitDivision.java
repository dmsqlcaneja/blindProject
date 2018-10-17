package com.blindproject.blind.entity;

//채용구분 
public class RecruitDivision {

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

	// RecruitDivision 모델 복사
	public void CopyData(RecruitDivision param) {
		this.id = param.getId();
		this.value = param.getValue();
	}

	public RecruitDivision() {
		super();
	}

	public RecruitDivision(Integer id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	
}
