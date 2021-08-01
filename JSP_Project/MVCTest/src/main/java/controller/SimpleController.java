//@ 작성일 : 2021. 7. 29.
// 서블릿생성
package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet { // doget, do post 오버라이

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

		

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //처리구간
		
		// 1. 사용자의 요청 분석 : type 파라미터의 값을 분석
		String type = request.getParameter("type"); // 파라미터의 이름을 받는다.
		
		// 결과 Data
		Object resultObj = null;
		// view 페이지 : 사용자가 직접 들어가면 안된다. 
		// 그래서 WEB-INF에 감추는 것, views는 모아두기 -> 컨트롤러를 통해서만 볼 수 있게한다.
		String viewPage = "/WEB-INF/views/default.jsp";
		
		// 2. 요청을 처리 : 모델 선택 실행 -> 요청을 처리할 수 있는 Service를 선택
		// 사용자의 요청이 많아질수록 코드가 늘어난다 -> 커맨드 패턴
		if(type == null || type.equals("greeting")) {
			// 처리할 수 잇는 서비스의 메소드를 실행 -> 위에 결과 Data 생성
			resultObj = "안녕하세요";
			viewPage = "/WEB-INF/views/greeting.jsp"; // 포워딩할때 사용
		} else if (type.equals("date")) {
			resultObj = new Date();
			viewPage = "/WEB-INF/views/date.jsp";
		} else { // 이도저도 아니라면
			resultObj = "Invalid Type Request"; // 기본페이지
			
		}
		
		// 3. 결과 데이터를 공유 (전달)
		request.setAttribute("result", resultObj);
		
		// 4. viewPage로 포워딩 / sqlEx
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
