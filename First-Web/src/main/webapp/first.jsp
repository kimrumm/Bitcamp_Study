<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 스크립트 영역
    java.util.Date now = new Date();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<!-- 날짜와 시간을 출력 -->
	<!-- 화면에 출력시 표현식 사용 --> 
	<%= now %>

</body>
</html>