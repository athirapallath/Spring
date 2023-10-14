package com.springmvc.lc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.lc.api.CommunicationDTO;
import com.springmvc.lc.api.Phone;
import com.springmvc.lc.api.RegisterDTO;
import com.springmvc.lc.propertyeditor.CustomNameEditor;
import com.springmvc.lc.validator.EmailSFValidator;
import com.springmvc.lc.validator.UserNameValidator;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String createAccount(@ModelAttribute("registerInfo") RegisterDTO registerDTO) {
		System.out.println("inside the registration controller register method handler");
		
		//assume DB code to fetch existing phone number
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("7356255411");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		registerDTO.setCommunicationDTO(communicationDTO);
		
		return "register-page";
		
	}
	
	@RequestMapping("/success")
	public String registerSuccess(@Valid @ModelAttribute("registerInfo") RegisterDTO registerDTO,BindingResult result ){

		System.out.println("User enetered name is : " + "|" + registerDTO.getName()+"|");	
		
		if(result.hasErrors()) {
			
			System.out.println("my page has errors");
			
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError error : allErrors) {
				System.out.println(error);
			}
			return "register-page";
		}
		
		System.out.println("inside the registration controller register-success method handler");				
		return "success-page";		
	}
	

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		System.out.println("inside init binder method");
        //this will make the string with white spaces as null if given true as argument
		//this will make the string with white spaces as "" false as argument
		StringTrimmerEditor  editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", editor);
		
		//binder.setDisallowedFields("uName");
		
		
		//create custom editor to convert name value  to uppercase
		CustomNameEditor nameEditor = new CustomNameEditor();
	    binder.registerCustomEditor(String.class, nameEditor);
	    binder.registerCustomEditor(String.class, "name",nameEditor);
	 	    
	    binder.addValidators(new UserNameValidator());
	    binder.addValidators(new EmailSFValidator());
	}


}
