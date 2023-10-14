package com.springmvc.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.springmvc.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{


	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		System.out.println("inside the parse method of phoneNumberFormatter");
		//logic
		Phone phone = new Phone();
		String[] phoneNumberArray =text.split("-");
		//whether the number consists of -
		int index=text.indexOf('-');
		//if - is not found, then set deafult conttry code as 91
		if(index == -1 || text.startsWith("-") ) {
			    phone.setCountryCode("91");
			    if(text.startsWith("-")) {
			    	phone.setUserNumber(phoneNumberArray[1]);
			    }else {
			    	phone.setUserNumber(phoneNumberArray[0]);
			    }
			    
		}else {
			phone.setCountryCode(phoneNumberArray[0]);
		    phone.setUserNumber(phoneNumberArray[1]);
		}
						
		return phone;
	}

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside the print method of phoneNumberFormatter");
		
		
		return phone.getCountryCode()+"-"+phone.getUserNumber();
	}

}
