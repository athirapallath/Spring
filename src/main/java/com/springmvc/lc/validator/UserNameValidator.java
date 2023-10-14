package com.springmvc.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.lc.api.RegisterDTO;

//Spring own validation API -Spring validation api

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return RegisterDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "uName", "userName.empty" ,"User name can't be empty");
		
		
       String userName = ((RegisterDTO)object).getuName();
       
       if(!userName.contains("_")) {
    	     errors.rejectValue("uName", "userName.invalidString","String must contains a '_'");
       }
		
	}

}
