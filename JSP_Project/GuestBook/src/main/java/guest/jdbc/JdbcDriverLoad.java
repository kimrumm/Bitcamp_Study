// @ 작성일 : 2021. 7. 27.
// 1. 애플리케이션 초기화 : 서블릿 -> 데이터베이스 드라이버 로드
// 2. web.xml 이동 후 서블릿 작성하기
// 데이터베이스가 변경되어도 이 클래스는 바꿀것이 없다.

package guest.jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class JdbcDriverLoad extends HttpServlet {

	//오버라이딩해주기 - init(ServletConfig)
	//config - web.xml에서 설정되어있는 파라미터 값을 가져오는 것
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		String jdbcDriver = config.getInitParameter("jdbcdriver");
		
		try {
			//jdbc가 설정이 안되어있는 경우
			jdbcDriver = jdbcDriver == null ? "com.mysql.cj.jdbc.Driver":jdbcDriver;
			Class.forName(jdbcDriver);
			System.out.println("mysql Driver Load....!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			//드라이버 로드가 안되면 에러를 던져야한다. 문제가 생기면 서버 실행 x
			throw new RuntimeException(e);
		}
		
		
	
	
	

}
}
