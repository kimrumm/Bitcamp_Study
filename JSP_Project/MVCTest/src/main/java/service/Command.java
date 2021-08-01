//@ 작성일 : 2021. 7. 29.

package service;

import javax.servlet.http.HttpServletRequest;

public interface Command {
	
	// GreetingCommandImpl 
	// 메소드가 추상메소드
	// public abstract 
	String getPage(HttpServletRequest request);
	

}
