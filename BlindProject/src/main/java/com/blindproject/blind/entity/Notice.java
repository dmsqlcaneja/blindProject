package com.blindproject.blind.entity;

//공지사항 
public class Notice {

	// 아이디
	private Integer id;

	// 제목
	private String title;

	// 등록일
	private String regDate;

	// 전형아이디
	private Integer typeId;

	// 회사아이디
	private Integer companyId;

	// 채용구분
	private Integer recruitDivisionId;

	// 작성자
	private Integer writer;

	// 내용
	private String contents;

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

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getRecruitDivisionId() {
		return recruitDivisionId;
	}

	public void setRecruitDivisionId(Integer recruitDivisionId) {
		this.recruitDivisionId = recruitDivisionId;
	}

	public Integer getWriter() {
		return writer;
	}

	public void setWriter(Integer writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	// Notice 모델 복사
	public void CopyData(Notice param) {
		this.id = param.getId();
		this.title = param.getTitle();
		this.regDate = param.getRegDate();
		this.typeId = param.getTypeId();
		this.companyId = param.getCompanyId();
		this.recruitDivisionId = param.getRecruitDivisionId();
		this.writer = param.getWriter();
		this.contents = param.getContents();
	}
}