package com.blindproject.blind.entity;

//기본정보 
public class BasicInfo {

	// 아이디
	private Integer id;

	// 주소
	private String address;

	// 긴급연락처
	private String emergencyNum;

	// 전화번호
	private String number;

	// 휴대전화
	private String phonNumber;

	// 개인정보아이디
	private Integer personalInfoId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergencyNum() {
		return emergencyNum;
	}

	public void setEmergencyNum(String emergencyNum) {
		this.emergencyNum = emergencyNum;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhonNumber() {
		return phonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	public Integer getPersonalInfoId() {
		return personalInfoId;
	}

	public void setPersonalInfoId(Integer personalInfoId) {
		this.personalInfoId = personalInfoId;
	}

	// BasicInfo 모델 복사
	public void CopyData(BasicInfo param) {
		this.id = param.getId();
		this.address = param.getAddress();
		this.emergencyNum = param.getEmergencyNum();
		this.number = param.getNumber();
		this.phonNumber = param.getPhonNumber();
		this.personalInfoId = param.getPersonalInfoId();
	}
}