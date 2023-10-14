package com.springmvc.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.lc.api.EmailDTO;

@Controller
public class EmailController {
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("emailInfo") EmailDTO emailDTO) {
		
		return "sendEmail-page";
		
	}
	
	/*
	 * @RequestMapping("/sendEmail/{userName}") public String
	 * sendEmail(@PathVariable("userName") String userName ,Model model) {
	 * 
	 * model.addAttribute("emailInfo", new EmailDTO());
	 * model.addAttribute("userName",userName); return "sendEmail-page";
	 * 
	 * }
	 */
	
	/*
	 * @RequestMapping("/processEmail/{userName}") public String
	 * processMail(@PathVariable("userName") String userName,Model model) {
	 * 
	 * model.addAttribute("emailInfo", new EmailDTO());
	 * model.addAttribute("userName",userName); return "processEmail-page"; }
	 */
	
	@RequestMapping("/processEmail")
	public String processMail(@ModelAttribute("emailInfo") EmailDTO emailDTO) {
		
			return "processEmail-page";
	}
	
}
