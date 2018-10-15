package com.blindproject.blind.entity;

//신세계 직원 
public class SinEmployee {

 // 사원번호 
 private Integer id;

 // 회사선택 
 private Integer companyId;

 // 아이디 
 private String loginId;

 // 비밀번호 
 private String pwd;

 // 이메일 
 private String email;

 // 전화번호 
 private String phonNumber;

 // 이름 
 private String name;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public Integer getCompanyId() {
     return companyId;
 }

 public void setCompanyId(Integer companyId) {
     this.companyId = companyId;
 }

 public String getLoginId() {
     return loginId;
 }

 public void setLoginId(String loginId) {
     this.loginId = loginId;
 }

 public String getPwd() {
     return pwd;
 }

 public void setPwd(String pwd) {
     this.pwd = pwd;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public String getPhonNumber() {
     return phonNumber;
 }

 public void setPhonNumber(String phonNumber) {
     this.phonNumber = phonNumber;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // SinEmployee 모델 복사
 public void CopyData(SinEmployee param)
 {
     this.id = param.getId();
     this.companyId = param.getCompanyId();
     this.loginId = param.getLoginId();
     this.pwd = param.getPwd();
     this.email = param.getEmail();
     this.phonNumber = param.getPhonNumber();
     this.name = param.getName();
 }
}
