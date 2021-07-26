package jdbc.util;

import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class JdbcListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listener 진입 ");
		
		try {
			ServletContext context = sce.getServletContext();
			String driver = context.getInitParameter("jdbcdriver");
			
			StringTokenizer tokenizer = new StringTokenizer(driver, ",");
			while (tokenizer.hasMoreElements()) {
				String jdbcDriver = tokenizer.nextToken();
				//드라이버 로드
				Class.forName(jdbcDriver);
				System.out.println("드라이버 로드 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
			

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}
}
