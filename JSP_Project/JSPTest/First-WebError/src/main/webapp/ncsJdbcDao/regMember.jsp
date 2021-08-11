
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="member.domain.Member"%>
<%@page import="member.dao.MemberDao"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 1. 사용자가 입력한 데이터를 받고 -> 처리 -> 결과를 속성에 저장 -> view 지정

	// 입력데이터의 한글 처리!!!
	request.setCharacterEncoding("utf-8");

	String memberid = request.getParameter("memberid");
	String password = request.getParameter("password");
	String membername = request.getParameter("membername");

	Timestamp regdate = Timestamp.valueOf(LocalDateTime.now());

	int resultCnt = 0;

	// 2. DB 처리 : insert
	// 데이터베이스 드라이버 로드
	// 연결
	Connection conn = null;
	MemberDao dao = MemberDao.getInstance();

	try {

		conn = ConnectionProvider.getConnection();

		resultCnt = dao.insertMember(conn, new Member(0,memberid, password, membername, regdate));

	} catch (Exception e) {

	}

	if (resultCnt > 0) {
%>
<script>
	alert('등록되었습니다.');
	location.href = "member_list.jsp";
</script>
<%
	} else {
%>
<script>
	alert('오류 발생으로 등록되지 않았습니다.\n입력페이지로 다시 이동합니다.');
	//location.href = 'dept_regForm.jsp';
	window.history.go(-1);
</script>
<%
	}
%>