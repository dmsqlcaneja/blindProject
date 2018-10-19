package com.blindproject.blind.entity;

import java.util.Date;

//채용공고 
public class RecruitNotice {

	// 아이디
	private Integer id;

	// 제목
	private String title;

	// 내용
	private String contents;

	// 작성일
	private Date regDate;

	// 작성자
	private Integer writerId;

	// 모집시작일
	private Date strDate;

	// 모집종료일
	private Date endDate;

	// 채용구분
	private Integer recruitDivisionId;

	// 회사명
	private Integer companyId;
	
	
	//조인 컬럼--------------
	private String recruitDivisionValue;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getWriterId() {
		return writerId;
	}

	public void setWriterId(Integer writerId) {
		this.writerId = writerId;
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

	public Integer getRecruitDivisionId() {
		return recruitDivisionId;
	}

	public void setRecruitDivisionId(Integer recruitDivisionId) {
		this.recruitDivisionId = recruitDivisionId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	
	//조인 컬럼--------------
	public String getRecruitDivisionValue() {
		return recruitDivisionValue;
	}

	public void setRecruitDivisionValue(String recruitDivisionValue) {
		this.recruitDivisionValue = recruitDivisionValue;
	}

	// RecruitNotice 모델 복사
	public void CopyData(RecruitNotice param) {
		this.id = param.getId();
		this.title = param.getTitle();
		this.contents = param.getContents();
		this.regDate = param.getRegDate();
		this.writerId = param.getWriterId();
		this.strDate = param.getStrDate();
		this.endDate = param.getEndDate();
		this.recruitDivisionId = param.getRecruitDivisionId();
		this.companyId = param.getCompanyId();
		this.recruitDivisionValue = param.getRecruitDivisionValue();
	}

	public RecruitNotice() {
		super();
	}

	public RecruitNotice(Integer id, String title, String contents, Date regDate, Integer writerId, Date strDate,
			Date endDate, Integer recruitDivisionId, Integer companyId, String recruitDivisionValue) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.regDate = regDate;
		this.writerId = writerId;
		this.strDate = strDate;
		this.endDate = endDate;
		this.recruitDivisionId = recruitDivisionId;
		this.companyId = companyId;
		this.recruitDivisionValue = recruitDivisionValue;
	}

	
}