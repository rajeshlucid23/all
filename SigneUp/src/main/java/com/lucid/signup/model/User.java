package com.lucid.signup.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User implements Serializable {
	
	
	
	
	public User(String id, String firstName, String lastName, String mobileNumber, Gender gender,
			FamilyType familyType, String fatherName, String motherName, String spouseName, String gardienName,
			UserStatus status, boolean validated) {
		super();
		this.id = id;
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
	private String id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private Gender gender;
	private FamilyType familyType ;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String gardienName;
	private UserStatus status=UserStatus.ACTIVE;
	@Transient
	private boolean validated;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public FamilyType getFamilyType() {
		return familyType;
	}
	public void setFamilyType(FamilyType familyType) {
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
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	public boolean isValidated() {
		return validated;
	}
	public void setValidated(boolean validated) {
		this.validated = validated;
	}
	
}
