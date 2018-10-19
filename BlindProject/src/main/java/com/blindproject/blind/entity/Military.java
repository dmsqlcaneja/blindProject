package com.blindproject.blind.entity;

import java.util.Date;

//병역사항 
public class Military {

	// 아이디
	private Integer id;

	// 복무시작일
	private Date strPeriod;

	// 군별
	private Integer militaryId;

	// 계급
	private Integer classesId;

	// 개인정보아이디
	private Integer personalInfoId;

	// 복무종료일
	private Date endPeriod;

	// 제대구분
	private Integer dischargeId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStrPeriod() {
		return strPeriod;
	}

	public void setStrPeriod(Date strPeriod) {
		this.strPeriod = strPeriod;
	}

	public Integer getMilitaryId() {
		return militaryId;
	}

	public void setMilitaryId(Integer militaryId) {
		this.militaryId = militaryId;
	}

	public Integer getClassesId() {
		return classesId;
	}

	public void setClassesId(Integer classesId) {
		this.classesId = classesId;
	}

	public Integer getPersonalInfoId() {
		return personalInfoId;
	}

	public void setPersonalInfoId(Integer personalInfoId) {
		this.personalInfoId = personalInfoId;
	}

	public Date getEndPeriod() {
		return endPeriod;
	}

	public void setEndPeriod(Date endPeriod) {
		this.endPeriod = endPeriod;
	}

	public Integer getDischargeId() {
		return dischargeId;
	}

	public void setDischargeId(Integer dischargeId) {
		this.dischargeId = dischargeId;
	}

	// Military 모델 복사
	public void CopyData(Military param) {
		this.id = param.getId();
		this.strPeriod = param.getStrPeriod();
		this.militaryId = param.getMilitaryId();
		this.classesId = param.getClassesId();
		this.personalInfoId = param.getPersonalInfoId();
		this.endPeriod = param.getEndPeriod();
		this.dischargeId = param.getDischargeId();
	}
}