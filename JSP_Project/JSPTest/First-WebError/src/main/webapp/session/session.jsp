<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    	session.setAttribute("username","김아름");
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
	<h1>세션에 사용자 이름을 저장했습니다: <%= session.getAttribute("userName")%> </h1>
	<h3><a href="sessionView.jsp">세션의</a></h3>
</body>
</html>