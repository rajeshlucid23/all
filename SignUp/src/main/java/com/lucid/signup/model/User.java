package com.lucid.signup.model;

import java.io.Serializable;
import org.springframework.data.annotation.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "public")
public class User implements Serializable {
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public User(String emailId, String firstName, String lastName, String mobileNumber, String gender,
			String familyType, String fatherName, String motherName, String spouseName, String gardienName,
			String status, boolean validated) {
		super();
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.familyType = familyType;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.spouseName = spouseName;
		this.gardienName = gardienName;
		this.status = status;
		this.validated = validated;
	}
	public User() {
		super();
	}
	@Id
	private String emailId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String gender;
	private String familyType ;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String gardienName;
	private String status="ACTIVE";
	@Transient
	private boolean validated;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFamilyType() {
		return familyType;
	}
	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getGardienName() {
		return gardienName;
	}
	public void setGardienName(String gardienName) {
		this.gardienName = gardienName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isValidated() {
		return validated;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
//update