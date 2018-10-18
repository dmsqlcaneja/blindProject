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
	private Integer writer;

	// 모집시작일
	private Date strDate;

	// 모집종료일
	private Date endDate;

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

	public Integer getWriter() {
		return writer;
	}

	public void setWriter(Integer writer) {
		this.writer = writer;
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

	// RecruitNotice 모델 복사
	public void CopyData(RecruitNotice param) {
		this.id = param.getId();
		this.title = param.getTitle();
		this.contents = param.getContents();
		this.regDate = param.getRegDate();
		this.writer = param.getWriter();
		this.strDate = param.getStrDate();
		this.endDate = param.getEndDate();
	}

	public RecruitNotice() {
		super();
	}

	public RecruitNotice(Integer id, String title, String contents, Date regDate, Integer writer, Date strDate,
			Date endDate) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
		this.regDate = regDate;
		this.writer = writer;
		this.strDate = strDate;
		this.endDate = endDate;
	}
	
}
