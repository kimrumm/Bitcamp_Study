<%@page import="member.dao.MemberDao"%>
<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 사용자가 전달하는 deptno 받고 -> 실행 -> 결과
	String memberid = request.getParameter("memberid");

	// DB 에 있는 데이터를 삭제
	int resultCnt = 0;

	// 2. DB 처리 : insert

	Connection conn = null;
	MemberDao dao = MemberDao.getInstance();

	try {
		conn = ConnectionProvider.getConnection();
		resultCnt = dao.deleteMember(conn, memberid);
		
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (Exception e){
		e.printStackTrace();
	} finally {
		JdbcUtil.close(conn);
	}
	
	

	if (resultCnt > 0) {
%>
<script>
	alert('삭제되었습니다.');
	location.href = 'dept_list.jsp';
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