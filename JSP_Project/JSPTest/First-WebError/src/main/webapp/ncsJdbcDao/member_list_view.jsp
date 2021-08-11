<%@page import="member.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
/* Attribute는 object 타입으로 들어와서 형변환 해줘야 한다. */
List<Member> list = (List<Member>) request.getAttribute("result");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<style>
td {
	text-align: center;
	padding: 5px 10px;
}

button {
	margin: 5px 0;
}
</style>
<script>
</script>
</head>
<body>

</style>
<script>
	
</script>
</head>
<body>

	<h1>회원 정보 리스트</h1>
	<hr>

	<button onclick="location.href='member_regForm.jsp';">회원정보등록</button>

	<table border=1>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>가입일시</th>
		</tr>
		<%
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<!-- 출력하기 편하기 위해 리스트를 이용한다. -->
			<td><%=list.get(i).getMemberid()%></td>
			<td><%=list.get(i).getPassword()%></td>
			<td><%=list.get(i).getMembername()%></td>
			<td><%=list.get(i).getRegdate()%></td>
		</tr>
		<%
		}
		}
		%>

	</table>

</body>
</html>