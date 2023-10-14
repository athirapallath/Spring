package com.springmvc.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message="* user name cannot be blank")
	@Size(min=3, max=15, message="* your name should have characters between 3 and 15")
	private String userName;
    	
	@NotBlank(message="* crush name cannot be blank")
	@Size(min=3, max=15, message="* crush name should have characters between 3 and 15")
	private String crushName;
	
	@AssertTrue(message="You have to agree to use our app")
	private boolean termandCondition;
	
	public UserInfoDTO() {
		System.out.println("user info DTO called");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean isTermandCondition() {
		return termandCondition;
	}

	public void setTermandCondition(boolean termandCondition) {
		this.termandCondition = termandCondition;
	}
	
	
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

	
	

}
