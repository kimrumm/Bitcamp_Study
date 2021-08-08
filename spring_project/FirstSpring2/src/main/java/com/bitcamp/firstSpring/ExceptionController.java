package com.bitcamp.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
	
	private String str;
	
	@RequestMapping("/error/error")
	public String getPage() {
		
		str = "string";
		
		System.out.println(str.charAt(0));
		
		return "index";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String hadleNullPorinterException(NullPointerException e) {
		e.printStackTrace(); // 흔적을 남겨야 오류를 잡을 수 있다.
		return "error/nullPointer";
	}

}
