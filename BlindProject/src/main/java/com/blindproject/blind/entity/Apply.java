package com.blindproject.blind.entity;

import java.util.Date;

//채용공고에 지원하기
public class Apply {

	//아이디
	private int id;
	
	//채용 공고 아이디
	private int recruitNoticeId;
	
	//구직자 아이디
	private int applierId;
	
	//지원 일자
	private Date applyDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRecruitNoticeId() {
		return recruitNoticeId;
	}

	public void setRecruitNoticeId(int recruitNoticeId) {
		this.recruitNoticeId = recruitNoticeId;
	}

	public int getApplierId() {
		return applierId;
	}

	public void setApplierId(int applierId) {
		this.applierId = applierId;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Apply() {
		super();
	}

	public Apply(int id, int recruitNoticeId, int applierId, Date applyDate) {
		super();
		this.id = id;
		this.recruitNoticeId = recruitNoticeId;
		this.applierId = applierId;
		this.applyDate = applyDate;
	}
	
}
