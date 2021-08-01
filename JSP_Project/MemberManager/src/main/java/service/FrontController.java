//@ 작성일 : 2021. 7. 29.
// 서블릿 구현 - 모든 요청을 받는다.

package service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet { // HttpServlet 클래스를 상속 받는다.

	private Map<String, Command> commands = new HashMap<String, Command>();

	// init 오버라이딩
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		// 설정파일의 경로 가져오기
		String configFile = config.getInitParameter("config");
		Properties prop = new Properties();
		
		FileInputStream fis = null;
		// 설정 파일 시스템 경로 
		String configPath = config.getServletContext().getRealPath(configFile);
		
		try {
			fis = new FileInputStream(configFile); // 예외처리 FileNotFoundException
			prop.load(fis);						   // 예외처리 IOException 
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
				Command commandObj = (Command)commandClass.newInstance();
				commands.put(command, commandObj);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}

	}

	@Override
	protected void doGet(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(requset, response);

	}

	@Override
	protected void doPost(HttpServletRequest requset, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(requset, response);
	}

	// doGet, doPost -> 오버라이딩

	private void doProcess(HttpServletRequest requset, HttpServletResponse response) {
		
		
		
		

	}
}
