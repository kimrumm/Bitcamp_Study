//@ 작성일 : 2021. 7. 29.
// 서블릿생성
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Command;
import service.InvalidCommandImpl;

public class FrontController3 extends HttpServlet { // doget, do post 오버라이딩

	// 맵 생성
	private Map<String, Command> commands = new HashMap<String, Command>();
	// 사용자요청 (uri), new GreetingCommandImpl
	// 저장을 해놓고 있으면 맵에서 커맨드 객체를 반환해준다. -> 코드가 줄어든다.
	// commands.put("/", new GreetingCommandImpl())

	@Override
	public void init(ServletConfig config) throws ServletException {

		// commands 에 요청 문자열과 처리할 객체를 저장
//		commands.put("/", new GreetingComandImpl()); 	// / 
//		commands.put("/greeting.do",new GreetingComandImpl());
//		commands.put("/date.do", new DateCommandImpl());

		// 설정파일의 경로 가져오기
		String configFile = config.getInitParameter("config");
		Properties prop = new Properties();

		FileInputStream fis = null;
		// 설정 파일의 시스템 경로
		String configPath = config.getServletContext().getRealPath(configFile);
		

		try {
			fis = new FileInputStream(configFile);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Iterator<Object> itr = prop.keySet().iterator();
		while (itr.hasNext()) {
			String command = (String) itr.next();
			String commandClassName = prop.getProperty(command);
			// 클래스 이름으로 해당 클래스의 인스턴스 생성
			
			try {
				Class commandClass = Class.forName(commandClassName);
				Command commandObj = (Command) commandClass.newInstance();
				commands.put(command, commandObj);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}
	
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { //처리구간

		// 1. 사용자의 요청 분석 : URI를 추출해서 사용
		String commandUri = request.getRequestURI();
		// http://localhost:8080/mvc/guest/list.do -> /mvc/guest/list.do
				if (commandUri.indexOf(request.getContextPath()) == 0) {
					commandUri = commandUri.substring(request.getContextPath().length());
				}

		// 결과 Data
		// Object resultObj = null;
		// view 페이지 : 사용자가 직접 들어가면 안된다.
		// 그래서 WEB-INF에 감추는 것, views는 모아두기 -> 컨트롤러를 통해서만 볼 수 있게한다.

		// 커맨드 패턴 ( 상위클래스를 두고 하나의 메소드만 처리해주는것 )
		String viewPage = "/WEB-INF/views/default.jsp";
		Command command = null;

		command = commands.get(commandUri);
		if (command == null) {
			command = new InvalidCommandImpl();
		}

		viewPage = command.getPage(request);
		// 4. viewPage로 포워딩 / sqlEx
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}
}
