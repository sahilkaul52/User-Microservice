package com.example.user.service.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class ContactMedium 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String mediumType;  //email, postal address, phone 
	
	private String city;
	
	private String postCode;
	
	private String email;
	
	private String mobileNumber;
	
	
	@ManyToOne
	private User user;
	
	public String getMediumType() {
		return mediumType;
	}

	public void setMediumType(String mediumType) {
		this.mediumType = mediumType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	

}
