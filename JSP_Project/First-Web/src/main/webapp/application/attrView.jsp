<%@page import="java.util.Enumeration"%>
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

<%
	Enumeration e = application.getAttributeNames();

	while(e.hasMoreElements()){
		String name = (String)e.nextElement();
		out.println(name + "<br>");
	}
%>


</body>
</html>