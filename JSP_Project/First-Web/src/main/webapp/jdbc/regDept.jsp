<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 1. 사용자가 입력한 데이터를 받자
	
	// 입력데이터의 한글처리
	request.setCharacterEncoding("utf-8");
	
	String deptno = request.getParameter("deptno");	
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	
	int resultCnt = 0;
	
	// 2. DB 처리 : insert
	
	// 데이터베이스 드라이버 로드
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// 연결
	Connection conn = null;
	PreparedStatement pstmt = null;
	// select가 아닌 insert 하는 것이라 ResultSet 필요X
	try {
	
	conn = ConnectionProvider.getConnection();
	
	// PreparedStatement 
	String sqlInsert = "insert into dept values(?, ?, ?)";
	pstmt = conn.prepareStatement(sqlInsert);
	pstmt.setInt(1, Integer.parseInt(deptno));
	pstmt.setString(2, dname);
	pstmt.setString(3, loc);
	
	resultCnt = pstmt.executeUpdate();
	
	//out.println(resultCnt);
	
	// insert -> int
	
	// 3. dept_list.jsp 이동 (sendRedirect/javascript 로케이션에 href 속성을 바꿔주는 것 )
	//response.sendRedirect("dept_list.jsp");
	
	//결과에 따라서 안보여주고 처리 할 수 있다. 
	
	} catch (Exception e) {
		
	}
	if (resultCnt>0){
		%>
		<script>
			alert('등록되었습니다.');
			location.href = 'dept_list.jsp';
		</script>
		<%
	} else {
		%>
		<script>
			alert('오류 발생으로 등록되지 않았습니다. \n입력페이지로 다시 이동합니다.');
			//location.href = 'dept_regForm.jsp';
			// 이전페이지로 이동 (사용자가 입력한 값 그대로 보인다.)
			window.history.go(-1);
		</script>
		<%
	}

%>