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

 // RecruitNotice 모델 복사
 public void CopyData(RecruitNotice param)
 {
     this.id = param.getId();
     this.title = param.getTitle();
     this.contents = param.getContents();
     this.regDate = param.getRegDate();
     this.writer = param.getWriter();
 }
}
