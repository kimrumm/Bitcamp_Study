//@ 작성일 : 2021. 7. 29.

package service;

import javax.servlet.http.HttpServletRequest;

public class GreetingCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request) {
		
		// 핵심처리....
		request.setAttribute("result", "안녕하세요");
		
		return "/WEF-INF/views/greeting.jsp";
	}

}
