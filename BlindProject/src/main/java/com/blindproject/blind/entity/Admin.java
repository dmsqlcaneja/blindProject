package com.blindproject.blind.entity;

//관리자 정보 
public class Admin {

	// 사원번호
	private Integer id;

	// 아이디
	private String loginId;

	// 비밀번호
	private String pwd;

	// 이메일
	private String email;

	// 전화번호
	private String phoneNumber;

	// 이름
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Admin 모델 복사
	public void CopyData(Admin param) {
		this.id = param.getId();
		this.loginId = param.getLoginId();
		this.pwd = param.getPwd();
		this.email = param.getEmail();
		this.phoneNumber = param.getPhoneNumber();
		this.name = param.getName();
	}
}