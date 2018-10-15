package com.blindproject.blind.entity;

//회사경력 
public class CompanyCareer {

 // 아이디 
 private Integer id;

 // 근무기간 
 private String workDate;

 // 회사명 
 private String companyName;

 // 직위 
 private String position;

 // 담당업무 
 private String task;

 // 연봉(만원) 
 private String salary;

 // 퇴직사유 
 private String retirement;

 // 개인정보아이디 
 private Integer personalInfoId;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public String getWorkDate() {
     return workDate;
 }

 public void setWorkDate(String workDate) {
     this.workDate = workDate;
 }

 public String getCompanyName() {
     return companyName;
 }

 public void setCompanyName(String companyName) {
     this.companyName = companyName;
 }

 public String getPosition() {
     return position;
 }

 public void setPosition(String position) {
     this.position = position;
 }

 public String getTask() {
     return task;
 }

 public void setTask(String task) {
     this.task = task;
 }

 public String getSalary() {
     return salary;
 }

 public void setSalary(String salary) {
     this.salary = salary;
 }

 public String getRetirement() {
     return retirement;
 }

 public void setRetirement(String retirement) {
     this.retirement = retirement;
 }

 public Integer getPersonalInfoId() {
     return personalInfoId;
 }

 public void setPersonalInfoId(Integer personalInfoId) {
     this.personalInfoId = personalInfoId;
 }

 // CompanyCareer 모델 복사
 public void CopyData(CompanyCareer param)
 {
     this.id = param.getId();
     this.workDate = param.getWorkDate();
     this.companyName = param.getCompanyName();
     this.position = param.getPosition();
     this.task = param.getTask();
     this.salary = param.getSalary();
     this.retirement = param.getRetirement();
     this.personalInfoId = param.getPersonalInfoId();
 }
}