<%@page import="java.util.List"%>
<%@page import="dept.domain.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
/* Attribute는 object 타입으로 들어와서 형변환 해줘야 한다. */
List<Dept> list = (List<Dept>) request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

	<h1>부서 리스트</h1>
	<hr>
		
	<button onclick="location.href='dept_regForm.jsp';">부서정보등록</button>

	<table border=1>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>위치</th>
			<th>관리</th>
		</tr>
		<%
			if(list!=null){
				for(int i=0; i<list.size(); i++){
					%>
		<tr>
			<!-- 출력하기 편하기 위해 리스트를 이용한다. -->
			<td><%= list.get(i).getDeptno() %></td>
			<td><%= list.get(i).getDname() %></td>
			<td><%= list.get(i).getLoc() %></td>
			<td><a href="dept_editForm.jsp?deptno=<%= list.get(i).getDeptno() %>">수정</a>  
			<a href="javascript:delDept(<%= list.get(i).getDeptno() %>)">삭제</a></td>
		</tr>
		<% 
				}
			}
		%>

	</table>
	
	<script>
		function delDept(deptno) {
			if(confirm('정말 삭제하시겠습니까?')) {
				location.href = 'dept_delete.jsp?deptno='+deptno;
			}
			
		}
	</script>

	<%-- <%
	out.println(list);
	%> --%>

</body>
</html>