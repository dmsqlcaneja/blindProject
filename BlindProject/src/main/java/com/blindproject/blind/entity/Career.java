package com.blindproject.blind.entity;

import java.util.Date;

//경력사항
public class Career {

	//아이디
	private int id;

	//이전 회사명
	private String preCompany;
	
	//직위
	private String position;
	
	//입사일
	private Date strDate;
	
	//퇴사일
	private Date endDate;
	
	//담당 업무
	private String task;
	
	//이력서 아이디
	private int resumeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPreCompany() {
		return preCompany;
	}

	public void setPreCompany(String preCompany) {
		this.preCompany = preCompany;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getStrDate() {
		return strDate;
	}

	public void setStrDate(Date strDate) {
		this.strDate = strDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getResumeId() {
		return resumeId;
	}

	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}

	public Career() {
		super();
	}

	public Career(int id, String preCompany, String position, Date strDate, Date endDate, String task, int resumeId) {
		super();
		this.id = id;
		this.preCompany = preCompany;
		this.position = position;
		this.strDate = strDate;
		this.endDate = endDate;
		this.task = task;
		this.resumeId = resumeId;
	}
	
}
