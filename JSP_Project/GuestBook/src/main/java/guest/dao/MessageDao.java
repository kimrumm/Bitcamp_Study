// @ 작성일 : 2021. 7. 28.
// 9. 
// -> JdbcUtil.java
// 싱글톤 처리, DAO는 메소드만 존재하는 클래스 
// -> 불필요한 인스턴스 생성 하지 않고 싱글톤 패턴을 적용해서 하나만 만들어 놓고 생성하지 못하도록한다. 

package guest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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


	// 전체 게시물의 개수
	public int selectAllCount(Connection conn) throws SQLException {
		
		int totalCount = 0;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			
			String sql = "select count(*) from guestbook_message";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				totalCount = rs.getInt(1);
			}
			
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
		return totalCount;
	}


	// 요청 페이지에 표현할 메시지 리스트 구하기
	public List<Message> selectMessageList(Connection conn, int firstRow, int messageCountPerPage) throws SQLException {
		
		List<Message> list = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from guestbook_message order by regdate desc limit ?, ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, firstRow);
			pstmt.setInt(2, messageCountPerPage);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<Message>();
			while(rs.next()) {
				
				list.add(new Message(
						rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getTimestamp(5)));
			}
			
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	
	
	
	
	
	
	
	
	
	
	
}
