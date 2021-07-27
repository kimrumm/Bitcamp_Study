package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//회원정보 불러오기, 입력하기
public class UserDao {

	
	//Connection 데이터 베이스 접근하게 해주는 하나의 객체 - 연결
	private Connection conn;
	// 설정 및 실행
	private PreparedStatement pstmt;
	//하나의 정보를 담을 수 있는 하나의 객체 - 결과값
	private ResultSet rs;
	
	//생성자
	// mysql에 접속할 수 있도록 도와줌
	public UserDao () {
	try {
		String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
		String user = "bit";
		String pw = "bit";
		
	//driver는 mysql에 접속할 수 있도록 도와주는 하나의 라이브러리 매개체
		Class.forName("com.mysql.jdbc.Driver");
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace(); //어떤 오류인지 출력
	}

		
	}
	
	// 실제 로그인을 시도하는 함수
		public int login (String memberId, String password) { // 아이디와 비밀번호를 받아온다
			
			//db에 입력할 sql문
			String sql = "select memberpassword from member where meberid=?";
			
		
			try {
				pstmt = conn.prepareStatement(sql); //sql 쿼리문을 대기
				pstmt.setString(1,memberId); //첫번째 '?'에 매개변수로 받아온 memberid를 대입
				rs = pstmt.executeQuery(); //쿼리 실행한 결과를 rs에 저장
				
				if(rs.next()) {
					if(rs.getString(1).equals(password))
						return 1; //로그인 성공
				} else {
					return 0;// 비밀번호 불일치
				}
				return -1; //아이디가 없음
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return -2;// 데이터베이스 오류를 의미
			
		}
}
