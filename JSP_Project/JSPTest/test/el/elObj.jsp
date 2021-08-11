<%@page import="member.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   	/* request.setAttribute("name", "김아름"); */
    session.setAttribute("name", "김름");
    application.setAttribute("name", "김태리");
    
    Member member = new Member();
    member.setId("cool");
    member.setName("COOL");
    member.setPw("1234");
    session.setAttribute("member", member);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	표현식 : <%= request.getAttribute("name") %> <br>
	
	표현언어1 : <span>${requestScope.name}</span><br><br>
	내장객체의 표현식이 생략되었을 때 규칙 <br>
	1. pageScope의 속성을 찾는다 -> 2.requestScope -> 3.sessionScope -> 4.applicationScope
	<br><br>
	표현언어2 : <span>${name}</span><br>
	
	표현언어3 : <span>${sessionScope.name}</span> <br>
	
	표현언어3 : <span>${applicationScope.name}</span>
	
	<hr>
	param.code : <%=request.getParameter("code") %><br> <!-- 표현식 -->
	param.code : ${param.code} <!-- 표현언어 -->
	
	<hr>
	pageContext : <%= pageContext.getRequest().getServletContext().getContextPath() %>
	<br>
	${pageContext.request.requestURI} <br>
	${pageContext.request.requestURI} <br>
	${pageContext.request.contextPath} <br>
	<%= request.getContextPath() %>
	
	<br>
	<hr>
	${true} / ${100 } / ${'김아름'} /${null}
	
	<hr> <!--  member.getId() -->
	${member } / ${member.id}
	<br>
	<%= session.getAttribute("member") %> / <%= ((Member)session.getAttribute("member")).getId() %>

</body>
</html>