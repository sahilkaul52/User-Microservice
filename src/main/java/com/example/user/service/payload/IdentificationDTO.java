package com.example.user.service.payload;

public class IdentificationDTO 
{
	
	
	private String identificationType; // Adhaar, PAN, Driver License
	
    private String identificationId;
	
	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getIdentificationId() {
		return identificationId;
	}

	public void setIdentificationId(String identificationId) {
		this.identificationId = identificationId;
	}
    

}
