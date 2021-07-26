<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LoginForm</h1>
	<hr> 
	<!--  /web/member/mypage/mypage.jsp -> mypage의 모든것을 필터처리 = 절대경로 필요 -->
	<form action="<c:url value ="/member/login.jsp"/>">
		<table>
			<tr>
				<td>아이디</td>
				<td> <input type="text" name=id> </td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td> <input type="password" name=id> </td>
			</tr>
			<tr>
				<td></td>
				<td> <input type="submit"> </td>
			</tr>
		</table>
	</form>

</body>
</html>