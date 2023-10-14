package com.springmvc.lc.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.lc.api.UserInfoDTO;

@Validated
@Controller
@SessionAttributes("userInfo")
public class LCAppController {
	
	
	@RequestMapping("/")
	public String showHomePage(Model model) {
		
		model.addAttribute("userInfo", new UserInfoDTO());
		return  "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult bindingResult)  {
				
		System.out.println(userInfoDTO.isTermandCondition());
		
		if(bindingResult.hasErrors()) {
			
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			  
			for(ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			
			return "home-page";
		}
		
				
		//write a service which will calculate the result
		
		return "result-page";
	}
	
	
	
	//using session object -> HttpSession session
	
	/*
	 * @RequestMapping("/process-homepage") public String
	 * showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
	 * BindingResult bindingResult,HttpSession session) {
	 * 
	 * System.out.println(userInfoDTO.isTermandCondition());
	 * 
	 * if(bindingResult.hasErrors()) {
	 * 
	 * List<ObjectError> allErrors = bindingResult.getAllErrors();
	 * 
	 * for(ObjectError temp : allErrors) { System.out.println(temp); }
	 * 
	 * return "home-page"; }
	 * 
	 * session.setAttribute("lcappUserName", userInfoDTO.getUserName());
	 * 
	 * //write a service which will calculate the result
	 * 
	 * return "result-page"; }
	 */
	
	
	
//using cookies keeping the user session	
	
	/*
	 * @RequestMapping("/") public String showHomePage(@ModelAttribute("userInfo")
	 * UserInfoDTO userInfoDTO, HttpServletRequest request) {
	 * 
	 * Cookie[] theCookies = request.getCookies();
	 * 
	 * if(theCookies!=null) {
	 * 
	 * for(Cookie cookie : theCookies) {
	 * 
	 * if(cookie.getName().equals("LcApp.userName")) {
	 * userInfoDTO.setUserName(cookie.getValue()); }
	 * 
	 * } } return "home-page"; }
	 * 
	 * @RequestMapping("/process-homepage") public String
	 * showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO,
	 * BindingResult bindingResult, HttpServletResponse response) {
	 * 
	 * 
	 * 
	 * System.out.println(userInfoDTO.isTermandCondition());
	 * 
	 * if(bindingResult.hasErrors()) {
	 * 
	 * List<ObjectError> allErrors = bindingResult.getAllErrors();
	 * 
	 * for(ObjectError temp : allErrors) { System.out.println(temp); }
	 * 
	 * return "home-page"; } //create a cookie for the user name Cookie theCookie =
	 * new Cookie("LcApp.userName",userInfoDTO.getUserName());
	 * theCookie.setMaxAge(60*60*24); //expiry of cookie
	 * 
	 * //add cookie to the response response.addCookie(theCookie);
	 * 
	 * //write a service which will calculate the result
	 * 
	 * return "result-page"; }
	 */
	
}
