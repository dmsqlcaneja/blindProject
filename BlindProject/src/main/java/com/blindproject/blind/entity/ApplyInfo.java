package com.blindproject.blind.entity;

//지원정보 
public class ApplyInfo {

 // 아이디 
 private Integer id;

 // 희망직군(1지망) 
 private String hopeJob1;

 // 희망지역(1지망) 
 private String hopeArea1;

 // 희망직군(2지망) 
 private String hopeJob2;

 // 희망직군(2지망) 
 private String hopeArea2;

 // 개인정보아이디 
 private Integer personalInfoId;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public String getHopeJob1() {
     return hopeJob1;
 }

 public void setHopeJob1(String hopeJob1) {
     this.hopeJob1 = hopeJob1;
 }

 public String getHopeArea1() {
     return hopeArea1;
 }

 public void setHopeArea1(String hopeArea1) {
     this.hopeArea1 = hopeArea1;
 }

 public String getHopeJob2() {
     return hopeJob2;
 }

 public void setHopeJob2(String hopeJob2) {
     this.hopeJob2 = hopeJob2;
 }

 public String getHopeArea2() {
     return hopeArea2;
 }

 public void setHopeArea2(String hopeArea2) {
     this.hopeArea2 = hopeArea2;
 }

 public Integer getPersonalInfoId() {
     return personalInfoId;
 }

 public void setPersonalInfoId(Integer personalInfoId) {
     this.personalInfoId = personalInfoId;
 }

 // ApplyInfo 모델 복사
 public void CopyData(ApplyInfo param)
 {
     this.id = param.getId();
     this.hopeJob1 = param.getHopeJob1();
     this.hopeArea1 = param.getHopeArea1();
     this.hopeJob2 = param.getHopeJob2();
     this.hopeArea2 = param.getHopeArea2();
     this.personalInfoId = param.getPersonalInfoId();
 }
}
