// @ 작성일 : 2021. 7. 28.
// 9. 
// -> JdbcUtil.java
// 싱글톤 처리, DAO는 메소드만 존재하는 클래스 
// -> 불필요한 인스턴스 생성 하지 않고 싱글톤 패턴을 적용해서 하나만 만들어 놓고 생성하지 못하도록한다. 

package guest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import guest.domain.Message;
import guest.jdbc.JdbcUtil;

public class MessageDao {

	private MessageDao () {};
	
	//인스턴스 생성
	// 외부에서 변경되지 못하도록 private를 써준다. 
	private static MessageDao dao = new MessageDao();
	
	public static MessageDao getInstance() {
		return dao;
		
	}
	
	public int writeMessage(Connection conn, Message message) throws SQLException {
		
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		String sql ="insert into guestbook_message (guestname, password, message) values (?, ?, ?)";
		
		//예외처리하지 않고 throws로 넘긴다.
		//try로 묶고 catch는 하지 않는다.
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,message.getGuestName());
			pstmt.setString(2,message.getPassword());
			pstmt.setString(3,message.getMessage());
			resultCnt = pstmt.executeUpdate();
			
		} finally {
			// close
			//상속관계 (다형성) 상위클래스 타입으로도 보낼 수 있다.
			//상속관계 안에서 close가 있기 때문에 문제가 없다.
			JdbcUtil.close(pstmt); 
		}
		
		
		
		return resultCnt; //0이 아닌지 꼭 확인하기 !
	}

}
