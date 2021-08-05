package com.bitcamp.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/header/header")
public class HeaderContoller {
	public String getHeader(
			
			@RequestHeader("referer") String reString,
			Model model
			
			) {
			
			System.out.println(reString);
			model.addAttribute("re",reString);
		
		
		//return "header/headerInfo";
		return "rediect:"+reString;
	}
	

}
