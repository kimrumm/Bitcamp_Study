
<%@page import="member.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<% 
		Member member = (Member) request.getAttribute("member");
	
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

	<h1>회원 정보 수정</h1>
	<hr>
	
	<!-- 처리가 되면 다시 member 리스트로 보낼것이다 -->
	<form action="editMember.jsp" method="post">
		<table>
			<tr>
				<td>회원 아이디</td>
				<!-- number은 pk이기 때문에 변경되면 안된다.->readonly -->
				<td><input type="text" name="memberid" value="<%= member.getMemberid()%>" required ></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" value="<%= member.getPassword()%>" required></td>
			</tr>
			<tr>
				<td>회원이름</td>
				<td><input type="text" name="membername" value="<%= member.getMembername()%>" required></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="등록" /> <input type="reset" />
				</td>
			</tr>
		</table>

	</form>






</body>
</html>