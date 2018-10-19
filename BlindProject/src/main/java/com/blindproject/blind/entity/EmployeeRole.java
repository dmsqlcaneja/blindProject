package com.blindproject.blind.entity;

//EmployeeRole 
public class EmployeeRole {

	// 직원아이디
	private Integer employeeId;

	// 권한
	private String roleName;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	// EmployeeRole 모델 복사
	public void CopyData(EmployeeRole param) {
		this.employeeId = param.getEmployeeId();
		this.roleName = param.getRoleName();
	}
}