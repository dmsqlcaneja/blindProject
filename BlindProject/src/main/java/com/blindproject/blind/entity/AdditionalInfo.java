package com.blindproject.blind.entity;

import java.util.Date;

//부가신상정보 
public class AdditionalInfo {

	// 아이디
	private Integer id;

	// 보훈여부
	private String veterans;

	// 보훈번호
	private String veteransNum;

	// 보훈관청
	private String veteransWhitehall;

	// 보훈대상자와의관계
	private String veteransRelation;

	// 장애여부
	private String disabled;

	// 장애등급
	private String disabledLevel;

	// 판정시기
	private Date disabledDate;

	// 발행관청
	private String disabledWhitehall;

	// 취미/특기
	private String hobbiesSpecialty;

	// 개인정보아이디
	private Integer personalInfoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVeterans() {
		return veterans;
	}

	public void setVeterans(String veterans) {
		this.veterans = veterans;
	}

	public String getVeteransNum() {
		return veteransNum;
	}

	public void setVeteransNum(String veteransNum) {
		this.veteransNum = veteransNum;
	}

	public String getVeteransWhitehall() {
		return veteransWhitehall;
	}

	public void setVeteransWhitehall(String veteransWhitehall) {
		this.veteransWhitehall = veteransWhitehall;
	}

	public String getVeteransRelation() {
		return veteransRelation;
	}

	public void setVeteransRelation(String veteransRelation) {
		this.veteransRelation = veteransRelation;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getDisabledLevel() {
		return disabledLevel;
	}

	public void setDisabledLevel(String disabledLevel) {
		this.disabledLevel = disabledLevel;
	}

	public Date getDisabledDate() {
		return disabledDate;
	}

	public void setDisabledDate(Date disabledDate) {
		this.disabledDate = disabledDate;
	}

	public String getDisabledWhitehall() {
		return disabledWhitehall;
	}

	public void setDisabledWhitehall(String disabledWhitehall) {
		this.disabledWhitehall = disabledWhitehall;
	}

	public String getHobbiesSpecialty() {
		return hobbiesSpecialty;
	}

	public void setHobbiesSpecialty(String hobbiesSpecialty) {
		this.hobbiesSpecialty = hobbiesSpecialty;
	}

	public Integer getPersonalInfoId() {
		return personalInfoId;
	}

	public void setPersonalInfoId(Integer personalInfoId) {
		this.personalInfoId = personalInfoId;
	}

	// AdditionalInfo 모델 복사
	public void CopyData(AdditionalInfo param) {
		this.id = param.getId();
		this.veterans = param.getVeterans();
		this.veteransNum = param.getVeteransNum();
		this.veteransWhitehall = param.getVeteransWhitehall();
		this.veteransRelation = param.getVeteransRelation();
		this.disabled = param.getDisabled();
		this.disabledLevel = param.getDisabledLevel();
		this.disabledDate = param.getDisabledDate();
		this.disabledWhitehall = param.getDisabledWhitehall();
		this.hobbiesSpecialty = param.getHobbiesSpecialty();
		this.personalInfoId = param.getPersonalInfoId();
	}
}