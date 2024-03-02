package com.example.user.service.entities;

import java.sql.Date;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	

	@Id
    @Column(name = "ID")
	private String userId;
	
    @Column(name="NAME", length=20)
	private String name;
	
	private String email;
	
	private String origin;
	
	private String userSubtype;
	
	private Date previousBookingDate; // only for entity
	
	private List<String> ratingId;
			
	@OneToMany(mappedBy= "user")		
	private List<Identification> userIdentification;
	
	@OneToMany(mappedBy= "user")	
	private List<ContactMedium> contactMedium;
		
	
    public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getUserSubtype() {
		return userSubtype;
	}

	public void setUserSubtype(String userSubtype) {
		this.userSubtype = userSubtype;
	}

	public Date getPreviousBookingDate() {
		return previousBookingDate;
	}

	public void setPreviousBookingDate(Date previousBookingDate) {
		this.previousBookingDate = previousBookingDate;
	}

	public List<String> getRatingId() {
		return ratingId;
	}

	public void setRatingId(List<String> ratingId) {
		this.ratingId = ratingId;
	}

	
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Identification> getUserIdentification() {
		return userIdentification;
	}

	public void setUserIdentification(List<Identification> userIdentification) {
		this.userIdentification = userIdentification;
	}

	public List<ContactMedium> getContactMedium() {
		return contactMedium;
	}

	public void setContactMedium(List<ContactMedium> contactMedium) {
		this.contactMedium = contactMedium;
	}
	
	
}
