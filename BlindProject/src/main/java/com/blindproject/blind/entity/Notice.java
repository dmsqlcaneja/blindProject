package com.blindproject.blind.entity;

import java.util.Date;

//공지사항
public class Notice {

	//아이디
	private int id;

	//제목
	private String title;

	//등록일
	private Date regDate;

	//내용
	private String contents;

	//작성자 아이디(admin id)
	private int writerId;

	//전형구분(진행중, 완료)
	private int typeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
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

	public Notice() {
		super();
	}

	public Notice(int id, String title, Date regDate, String contents, int writerId, int typeId) {
		super();
		this.id = id;
		this.title = title;
		this.regDate = regDate;
		this.contents = contents;
		this.writerId = writerId;
		this.typeId = typeId;
	}

}
