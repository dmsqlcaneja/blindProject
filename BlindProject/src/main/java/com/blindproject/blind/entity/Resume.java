package com.blindproject.blind.entity;

//이력서
public class Resume {

	// 아이디
	private int id;

	// 성장 과정
	private String growth;

	// 지원 동기
	private String motivation;

	// 입사 후 포부
	private String ambition;

	// 성격의 장단점
	private String personality;

	// 자유 서술
	private String freeScript;

	// 주소
	private String address;

	// 비상 연락처
	private String emergencyNumber;

	// 휴대전화
	private String phoneNumber;

	// 지원 아이디(지원하는 행위에 대한 아이디)
	private int applierId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrowth() {
		return growth;
	}

	public void setGrowth(String growth) {
		this.growth = growth;
	}

	public String getMotivation() {
		return motivation;
	}

	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	public String getAmbition() {
		return ambition;
	}

	public void setAmbition(String ambition) {
		this.ambition = ambition;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getFreeScript() {
		return freeScript;
	}

	public void setFreeScript(String freeScript) {
		this.freeScript = freeScript;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getApplierId() {
		return applierId;
	}

	public void setApplierId(int applierId) {
		this.applierId = applierId;
	}

	public Resume() {
		super();
	}

	public Resume(int id, String growth, String motivation, String ambition, String personality, String freeScript,
			String address, String emergencyNumber, String phoneNumber, int applierId) {
		super();
		this.id = id;
		this.growth = growth;
		this.motivation = motivation;
		this.ambition = ambition;
		this.personality = personality;
		this.freeScript = freeScript;
		this.address = address;
		this.emergencyNumber = emergencyNumber;
		this.phoneNumber = phoneNumber;
		this.applierId = applierId;
	}

}
