package com.example.user.service.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Identification 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdentificationId;
	
	@Column(name = "identificationType")
	private String identificationType; // Adhaar, PAN, Driver License
	
	@Column(name = "identificationNumber")
	private String identificationNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private User user;
	
	
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public int getIdentificationId() {
		return IdentificationId;
	}

	public void setIdentificationId(int identificationId) {
		IdentificationId = identificationId;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    

}
