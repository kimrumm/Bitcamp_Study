<!-- 
7.입력 -> WriteMessageService.java
컨트롤러의 역할 - 중간에서 주문을 받고 음식을 만들어서 제공하는
데이터를 받아서 그대로 처리하라고 하는 것  
-->
 
<%@page import="guest.service.WriteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="messageRequest" class="guest.domain.MessageRequest" />
<jsp:setProperty property="*" name="messageRequest"/>
<%
	int result = WriteMessageService.getInstance().writeMessage(messageRequest);

	request.setAttribute("result", result);

%>
<jsp:forward page="write_view.jsp"/>
