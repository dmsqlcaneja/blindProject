package com.blindproject.blind.entity;

//구직자 정보
public class Applier {

	//아이디
	private int id;

	//로그인 아이디
	private String loginId;

	//비밀번호
	private String pwd;

	//이메일
	private String email;

	//이름
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Applier() {
		super();
	}

	public Applier(int id, String loginId, String pwd, String email, String name, String roleName) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.pwd = pwd;
		this.email = email;
		this.name = name;
		this.roleName = roleName;
	}

}
