package com.blindproject.blind.entity;

//경력사항 
//경력사항 
public class Career {

 // 아이디 
 private Integer id;

 // 주요담당업무1 
 private String importantTask1;

 // 주요담당업무2 
 private String importantTask2;

 // 주요업적 
 private String importantAchievements;

 // 연간급여 
 private String ySalary;

 // 개인정보아이디 
 private Integer personalInfoId;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public String getImportantTask1() {
     return importantTask1;
 }

 public void setImportantTask1(String importantTask1) {
     this.importantTask1 = importantTask1;
 }

 public String getImportantTask2() {
     return importantTask2;
 }

 public void setImportantTask2(String importantTask2) {
     this.importantTask2 = importantTask2;
 }

 public String getImportantAchievements() {
     return importantAchievements;
 }

 public void setImportantAchievements(String importantAchievements) {
     this.importantAchievements = importantAchievements;
 }

 public String getYSalary() {
     return ySalary;
 }

 public void setYSalary(String ySalary) {
     this.ySalary = ySalary;
 }

 public Integer getPersonalInfoId() {
     return personalInfoId;
 }

 public void setPersonalInfoId(Integer personalInfoId) {
     this.personalInfoId = personalInfoId;
 }

 // Career 모델 복사
 public void CopyData(Career param)
 {
     this.id = param.getId();
     this.importantTask1 = param.getImportantTask1();
     this.importantTask2 = param.getImportantTask2();
     this.importantAchievements = param.getImportantAchievements();
     this.ySalary = param.getYSalary();
     this.personalInfoId = param.getPersonalInfoId();
 }
}