<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="member.domain.Member"%>
<%@page import="java.sql.SQLException"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//1. 사용자가 입력한 데이터를 받고

	// 입력데이터의 한글 처리!!!
	request.setCharacterEncoding("utf-8");

	String memberid = request.getParameter("memberid");
	String password = request.getParameter("password");
	String membername = request.getParameter("membername");
	
	Timestamp regdate = Timestamp.valueOf(LocalDateTime.now());

	int resultCnt = 0;

	// 2. DB 처리 : insert

	// 데이터베이스 드라이버 로드

	Connection conn = null;
	MemberDao dao = null;

	try {
		conn = ConnectionProvider.getConnection();
		dao = MemberDao.getInstance();
		
		resultCnt = dao.updateMember(conn, new Member(0,memberid, password, membername, regdate));
		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

	if (resultCnt > 0) {
%>
<script>
	alert('수정되었습니다.');
	location.href = 'member_list.jsp';
</script>
<%
	} else {
%>
<script>
	alert("해당 데이터를 찾지 못했습니다.");
	location.href = 'member_list.jsp';
</script>
<%
	}
%>






