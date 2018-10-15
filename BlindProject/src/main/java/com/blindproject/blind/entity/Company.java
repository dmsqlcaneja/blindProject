package com.blindproject.blind.entity;

//회사 
public class Company {

 // 아이디 
 private Integer id;

 // 회사명 
 private String name;

 public Integer getId() {
     return id;
 }

 public void setId(Integer id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // Company 모델 복사
 public void CopyData(Company param)
 {
     this.id = param.getId();
     this.name = param.getName();
 }
}
