<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%    
    /* 핵심처리 */
    String[] list = {"김아름","김태리","요조"};
    
    request.setAttribute("players",list);
    %>
    
   	
<jsp:forward page="list_view.jsp"/>