<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
<style>
</style>
<script>
</script>
</head>
<body>
<%
	String name = "SON";
	
	request.getAttribute("test");
%>
<!-- jsp의 역할 : 특정 변수나 객체속성들을 출력해줌 -->
<!-- 당분간은 쓰지만 나중엔 el을 사용한다 -->

	안녕하세요 <%= name %> 
	
	<!-- 경로확인 -->
	<%= request.getContextPath() %>
</body>
</html>