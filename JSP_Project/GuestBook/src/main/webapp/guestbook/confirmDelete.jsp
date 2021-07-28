<!-- 삭제를 원하는 메세지를 받는 기능 -> messageDelete.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
</style>
<script>
</script>
</head>
<body>
	<h3>메시지를 삭제하려면 비밀번호를 입력하세요!</h3>
	<form action="messageDelete.jsp" method="post">
		비밀번호 <input type="password" name="password"> 
		<!-- 삭제하고자하는 메세지 아이디도 같이 보내줘야한다. 
		사용자에게 보여주지 않는 데이터 & 서버쪽에 전달해야한다면 
		: input type="hidden" 처리 -->
		<input type="hidden" name="mid" value="${param.mid}"> <br> 
		<input type="submit" value="삭제">
	</form>

</body>
</html>