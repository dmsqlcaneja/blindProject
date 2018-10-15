package com.blindproject.blind.entity;

import java.util.Date;

//병역사항 
public class MilitaryService {

 // 아이디 
 private Integer id;

 // 복무기간 
 private Date servicePeriod;

 // 군별 
 private String militaryGroup;

 // 계급 
 private String classes;

 // 개인정보아이디 
 private Integer personalInfoId;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public Date getServicePeriod() {
     return servicePeriod;
 }

 public void setServicePeriod(Date servicePeriod) {
     this.servicePeriod = servicePeriod;
 }

 public String getMilitaryGroup() {
     return militaryGroup;
 }

 public void setMilitaryGroup(String militaryGroup) {
     this.militaryGroup = militaryGroup;
 }

 public String getClasses() {
     return classes;
 }

 public void setClasses(String classes) {
     this.classes = classes;
 }

 public Integer getPersonalInfoId() {
     return personalInfoId;
 }

 public void setPersonalInfoId(Integer personalInfoId) {
     this.personalInfoId = personalInfoId;
 }

 // MilitaryService 모델 복사
 public void CopyData(MilitaryService param)
 {
     this.id = param.getId();
     this.servicePeriod = param.getServicePeriod();
     this.militaryGroup = param.getMilitaryGroup();
     this.classes = param.getClasses();
     this.personalInfoId = param.getPersonalInfoId();
 }
}