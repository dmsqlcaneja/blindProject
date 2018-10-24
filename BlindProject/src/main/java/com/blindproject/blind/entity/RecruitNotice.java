package com.blindproject.blind.entity;

import java.util.Date;

//채용 공고
public class RecruitNotice {

	// 아이디
	private int td;

	// 제목
	private String title;

	// 내용
	private String contents;

	// 등록일
	private Date regDate;

	// 모집 시작일
	private Date strDate;

	// 모집 종료일
	private Date endDate;

	// 채용구분 아이디(인턴, 계약직, 정규직)
	private int recruitDivisionId;

	// 작성자 아이디(Employee Id)
	private int writerId;

	// 전형구분 아이디
	private int typeId;

	// 회사명 아이디
	private int companyId;

	public int getTd() {
		return td;
	}

	public void setTd(int td) {
		this.td = td;
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

	public int getRecruitDivisionId() {
		return recruitDivisionId;
	}

	public void setRecruitDivisionId(int recruitDivisionId) {
		this.recruitDivisionId = recruitDivisionId;
	}

	public int getWriterId() {
		return writerId;
	}

	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public RecruitNotice() {
		super();
	}

	public RecruitNotice(int td, String title, String contents, Date regDate, Date strDate, Date endDate,
			int recruitDivisionId, int writerId, int typeId, int companyId) {
		super();
		this.td = td;
		this.title = title;
		this.contents = contents;
		this.regDate = regDate;
		this.strDate = strDate;
		this.endDate = endDate;
		this.recruitDivisionId = recruitDivisionId;
		this.writerId = writerId;
		this.typeId = typeId;
		this.companyId = companyId;
	}

}
