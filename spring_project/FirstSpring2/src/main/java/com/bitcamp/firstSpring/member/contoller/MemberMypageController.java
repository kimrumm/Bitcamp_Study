package com.bitcamp.firstSpring.member.contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class MemberMypageController {
	
	@RequestMapping("/member/mypage/{id}")
	public String mypage(
			
			@PathVariable("id") String uid,
			Model model
			
			) {
		
		
		
		return "member/mypage";
	}

}
