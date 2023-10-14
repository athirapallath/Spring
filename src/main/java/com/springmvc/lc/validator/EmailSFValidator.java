package com.springmvc.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.lc.api.RegisterDTO;

public class EmailSFValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return RegisterDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
	  
		   String email= ((RegisterDTO)object).getCommunicationDTO().getEmail();
		   
		   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "emailField.empty");
		   if((!email.isEmpty()) && ( !email.contains("@"))) {
			   
			   errors.rejectValue("communicationDTO.email", "email.not.valid");
			   
		   }
		   if(email.contains("@")) {
			   
			   String[] split = email.split("@");
			   
			   if(split[1]!="seleniumexpress.com") {
				   
				    errors.rejectValue("communicationDTO.email", "email.domain.check");
				    			    
			   }
		   }
		   
	}

}
