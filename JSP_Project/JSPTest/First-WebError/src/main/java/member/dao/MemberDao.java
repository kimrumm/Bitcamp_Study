package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.JdbcUtil;
import member.domain.Member;


public class MemberDao {

	// 싱글톤 패턴
	// 1. 인스턴스 생성을 막는다!!!
	private MemberDao() {
	}

	// 2. 클래스 내부에서 인스턴스를 생성!!
	private static MemberDao dao = new MemberDao();

	// 3. 외부에서 참조값을 반환 받을수 있는 메소드
	public static MemberDao getInstance() {
		return dao == null ? new MemberDao() : dao;
	}

	public List<Member> getMemberList(Connection conn)throws SQLException {

		Statement stmt = null;
		ResultSet rs = null;

		List<Member> list = null;

		try {
			stmt = conn.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<Member>();

			while (rs.next()) {
				list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getTimestamp(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		return list;
	}


	public int insertMember(Connection conn, Member member) {

		int resultCnt = 0;
		PreparedStatement pstmt = null;

		String sql = "insert into member values (?, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, member.getIdx());
			pstmt.setString(2, member.getMemberid());
			pstmt.setString(3, member.getPassword());
			pstmt.setString(4, member.getMembername());
			pstmt.setTimestamp(5, member.getRegdate());
			
			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;

	}

	public int deleteMember(Connection conn, String memberid) {
		int resultCnt = 0;
		PreparedStatement pstmt = null;

		String sql = "delete from member where memberid=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberid);

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;

	}

	public Member selectByMemberId(Connection conn, String memberid) {

		Member member = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from member where memberid=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberid);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getTimestamp(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}

		return member;

	}
	
	
	public int updateMember(Connection conn, Member member) {
		
		int resultCnt = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "update dept set memberid=?,password=?, membername=?  where memberid=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberid());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getMembername());
			
			resultCnt = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
		return resultCnt;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
