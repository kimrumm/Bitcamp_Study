//@ 작성일 : 2021. 7. 29.

package service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class DateService {
	
	public String getDate(HttpServletRequest request) {
		
		//.... 핵심처리
		
		request.setAttribute("result", new Date());
		
		return "/WEB-INF/views/date.jsp";
	}

}
