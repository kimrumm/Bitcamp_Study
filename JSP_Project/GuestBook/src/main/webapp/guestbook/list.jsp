<!-- 4. 화면 View - List -> 빈즈생성 : MessageRequest.java  -->
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
	<form action="writemessage.jsp" method="post" >
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" name="guestname" required></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password" required></td>
		</tr>
		<tr>
			<td>메세지</td>
			<td>
			<textarea name="message" rows="10" cols="30"></textarea>
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
			<input type="submit" value="메세지남기기">
			</td>
		</tr>
	</table>
	</form>

</body>
</html>