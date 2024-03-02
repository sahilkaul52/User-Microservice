package com.example.user.service.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Component
@Entity
public class Identification 
{
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String identificationType; // Adhaar, PAN, Driver License
	
    private String IdentificationId;
    
    @ManyToOne
    private User user;
	
	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getIdentificationId() {
		return IdentificationId;
	}

	public void setIdentificationId(String identificationId) {
		IdentificationId = identificationId;
	}
    

}
