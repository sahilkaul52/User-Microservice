package com.example.user.service.payload;

public class IdentificationDTO 
{
	
    private int identificationId;
	
	private String identificationType; // Adhaar, PAN, Driver License
	
	private String identificationNumber;
	
	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public int getIdentificationId() {
		return identificationId;
	}

	public void setIdentificationId(int identificationId) {
		this.identificationId = identificationId;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
    

}
