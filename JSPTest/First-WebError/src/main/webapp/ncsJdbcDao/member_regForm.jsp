<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<h1>회원 가입</h1>
	<hr>
	
	<!-- 처리가 되면 다시 member 리스트로 보낼것이다 -->
	<form action="regMember.jsp" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="memberid" required></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="membername" required></td>
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