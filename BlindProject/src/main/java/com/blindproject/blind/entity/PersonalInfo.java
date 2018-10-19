package com.blindproject.blind.entity;

//개인정보 
public class PersonalInfo {

	// 이메일
	private String email;

	// 이름
	private String name;

	// 비밀번호
	private String pwd;

	// 회사아이디
	private Integer companyId;

	// 채용공고선택
	private Integer employNotice;

	// 채용구분
	private Integer recruitDivisionId;

	// 아이디
	private Integer id;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getEmployNotice() {
		return employNotice;
	}

	public void setEmployNotice(Integer employNotice) {
		this.employNotice = employNotice;
	}

	public Integer getRecruitDivisionId() {
		return recruitDivisionId;
	}

	public void setRecruitDivisionId(Integer recruitDivisionId) {
		this.recruitDivisionId = recruitDivisionId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	// PersonalInfo 모델 복사
	public void CopyData(PersonalInfo param) {
		this.email = param.getEmail();
		this.name = param.getName();
		this.pwd = param.getPwd();
		this.companyId = param.getCompanyId();
		this.employNotice = param.getEmployNotice();
		this.recruitDivisionId = param.getRecruitDivisionId();
		this.id = param.getId();
	}
}