package com.blindproject.blind.entity;

//채용 담당자 정보
public class Employee {

	//아이디
	private int id;

	//로그인 아이디
	private String loginId;

	//비밀번호
	private String pwd;

	//이메일
	private String email;

	//휴대전화
	private String phoneNumber;

	//이름
	private String name;

	//회사 아이디
	private int companyId;

	//권한
	private String roleName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String loginId, String pwd, String email, String phoneNumber, String name, int companyId,
			String roleName) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.pwd = pwd;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.companyId = companyId;
		this.roleName = roleName;
	}

}
