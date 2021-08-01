//@ 작성일 : 2021. 7. 29.

package service;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.conf.ConnectionPropertiesTransform;

import dao.MemberDao;
import util.ConnectionProvider;

public class IdCheckService {
	
	// 싱글톤 처리
	private IdCheckService() {}
	private static IdCheckService service = new IdCheckService();
	public static IdCheckService getInstance () {
		return service;
	}
	
	public String idCheck(String memberId) {
		String result = "N";
		
		int cnt=0;
		
		Connection conn = null;
		MemberDao dao = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance(); //결과 받아오기
			
			//아이디로 검색하고 카운트를 가져오기 
			cnt = dao.selectById(conn, memberId); 
			
			// Y or N 들어와야한다. 
//			result = cnt > 0 ? "N" : "Y";
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		return cnt > 0 ? "N" : "Y";
		
	}

}
