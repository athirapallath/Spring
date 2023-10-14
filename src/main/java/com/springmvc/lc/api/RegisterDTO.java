package com.springmvc.lc.api;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;

import com.springmvc.lc.validator.Age;

public class RegisterDTO {
	
	@NotEmpty(message="* cannot be empty")
	private String name;
	private String uName;
	private char[] password;
	private String country;
	private String[] Hobby;
	private String gender;
	
	private CommunicationDTO communicationDTO;
	
	@Age
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobby() {
		return Hobby;
	}
	public void setHobby(String[] hobby) {
		Hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	} 
	
	@Override
	public String toString() {
		return "registerDTO [name=" + name + ", uName=" + uName + ", password=" + password + ", country=" + country
				+ ", Hobby=" + Arrays.toString(Hobby) + ", gender=" + gender + "]";
	}

}
