package com.springmvc.lc.api;

public class Phone {
	
	private String countryCode;
	private String userNumber;
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getUserNumber() {
		return userNumber;
	}
	
	public String toString() {
		
		return getCountryCode()+"-"+getUserNumber();
	}

}
