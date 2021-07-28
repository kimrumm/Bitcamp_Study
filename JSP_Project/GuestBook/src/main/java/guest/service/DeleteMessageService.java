//@ 작성일 : 2021. 7. 28.
//싱글톤 처리 

package guest.service;

import java.sql.Connection;
import java.sql.SQLException;


import guest.dao.MessageDao;
import guest.domain.Message;
import guest.exception.MessageNotFoundException;
import guest.exception.invalidPasswordException;
import guest.jdbc.ConnectionProvider;
import guest.jdbc.JdbcUtil;

public class DeleteMessageService {
	
	private DeleteMessageService() {}
	private static DeleteMessageService service = new DeleteMessageService();
	public static DeleteMessageService getInstance() {
		return service;
	}
	
	//응답처리
	public int deleteMessage(int mid, String pw) 
			throws SQLException, MessageNotFoundException, invalidPasswordException  {
		
		int resultCnt = 0;
		
		//컨넥션 가져오는것 처리
		Connection conn = null;
		MessageDao dao = null;
		
		try {
			//예외던지기 
			conn = ConnectionProvider.getConnection();
			dao = MessageDao.getInstance();
			
			// 트랜젝션 시작
			conn.setAutoCommit(false);
			
			// 전달받은 mid로 게시물 검색
			Message message = dao.selectByMid(conn, mid);
		 	
			if(message == null) { //게시물이 없는 것 
				
				//throw new Exception("게시물이 존재하지 않습니다.");
				// MessageNotFoundException 클래스에서 가져온다.
				// 여기서 예외처리를 안하면 던진다 -> 이 메소드를 호출한쪽으로!  
				throw new MessageNotFoundException(mid);
				
			} else { // 게시물이 있을때 처리
				
				if(message.getPassword().equals(pw)) {
					// 삭제
					resultCnt = dao.deleteMessage(conn, mid);
					// 트렌젝션 성공
					conn.commit();
					
				} else { 
					// 비밀번호가 일치하지 않음으로 예외 발생 !!!
					throw new invalidPasswordException();
					
				}
				
			}
			
			//전달받은 mid로 게시물을 검색
			
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcUtil.rollback(conn);
			throw e; //jsp 쪽에 예외를 알려주기 위해 다시 예외를 발생시키고 던졌다.
		} catch (MessageNotFoundException e) {
			e.printStackTrace();
			JdbcUtil.rollback(conn);
			throw e;
			
		} catch (invalidPasswordException e) {
			e.printStackTrace();
			JdbcUtil.rollback(conn);
			throw e;
			
		} finally { //conn 닫아주기
			
			JdbcUtil.close(conn);
			
		}
		
		return resultCnt;
		
	}

}
