package com.example.user.service.payload;

import java.util.ArrayList;
import java.util.List;


public class UserDTO 
{

	private String name;
	
	private String email;
	
	private List<IdentificationDTO> userIdentificationDTO = new ArrayList<>();
	
	private List<ContactMediumDTO> contactMediumDTO;
	
	private String nationality;
	
	private String userSubtype;

	
	public String getUserSubtype() {
		return userSubtype;
	}

	public void setUserSubtype(String userSubtype) {
		this.userSubtype = userSubtype;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
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

	public List<IdentificationDTO> getUserIdentificationDTO() {
		return userIdentificationDTO;
	}

	public void setUserIdentificationDTO(List<IdentificationDTO> userIdentificationDTO) {
		this.userIdentificationDTO = userIdentificationDTO;
	}

	public List<ContactMediumDTO> getContactMediumDTO() {
		return contactMediumDTO;
	}

	public void setContactMediumDTO(List<ContactMediumDTO> contactMediumDTO) {
		this.contactMediumDTO = contactMediumDTO;
	}



}
