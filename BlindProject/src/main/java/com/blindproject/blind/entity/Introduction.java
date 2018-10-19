package com.blindproject.blind.entity;

//자기소개 
public class Introduction {

	// 아이디
	private Integer id;

	// 성장과정(자신에 대한 소개)
	private String growth;

	// 보유기술 및 직무경험(구체적으로 기술)
	private String technology;

	// 경력기술서
	private String careerDescription;

	// 개인정보아이디
	private Integer personalInfoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrowth() {
		return growth;
	}

	public void setGrowth(String growth) {
		this.growth = growth;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getCareerDescription() {
		return careerDescription;
	}

	public void setCareerDescription(String careerDescription) {
		this.careerDescription = careerDescription;
	}

	public Integer getPersonalInfoId() {
		return personalInfoId;
	}

	public void setPersonalInfoId(Integer personalInfoId) {
		this.personalInfoId = personalInfoId;
	}

	// Introduction 모델 복사
	public void CopyData(Introduction param) {
		this.id = param.getId();
		this.growth = param.getGrowth();
		this.technology = param.getTechnology();
		this.careerDescription = param.getCareerDescription();
		this.personalInfoId = param.getPersonalInfoId();
	}
}