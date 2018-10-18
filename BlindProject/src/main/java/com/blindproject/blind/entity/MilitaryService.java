package com.blindproject.blind.entity;

import java.util.Date;

//병역사항 
public class MilitaryService {

// 아이디 
	private Integer id;

// 복무시작일 
	private Date strPeriod;

// 군별 
	private String militaryGroup;

// 계급 
	private String classes;

// 개인정보아이디 
	private Integer personalInfoId;

// 복무종료일 
	private Date endPeriod;

// 제대구분 
	private String group;

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

	public String getMilitaryGroup() {
		return militaryGroup;
	}

	public void setMilitaryGroup(String militaryGroup) {
		this.militaryGroup = militaryGroup;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

// MilitaryService 모델 복사
	public void CopyData(MilitaryService param) {
		this.id = param.getId();
		this.strPeriod = param.getStrPeriod();
		this.militaryGroup = param.getMilitaryGroup();
		this.classes = param.getClasses();
		this.personalInfoId = param.getPersonalInfoId();
		this.endPeriod = param.getEndPeriod();
		this.group = param.getGroup();
	}

	public MilitaryService() {
		super();
	}

	public MilitaryService(Integer id, Date strPeriod, String militaryGroup, String classes, Integer personalInfoId,
			Date endPeriod, String group) {
		super();
		this.id = id;
		this.strPeriod = strPeriod;
		this.militaryGroup = militaryGroup;
		this.classes = classes;
		this.personalInfoId = personalInfoId;
		this.endPeriod = endPeriod;
		this.group = group;
	}
	
}