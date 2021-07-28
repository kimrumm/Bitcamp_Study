<!-- 컨트롤러 역할 --> 
<%@page import="guest.exception.invalidPasswordException"%>
<%@page import="guest.exception.MessageNotFoundException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="guest.service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 데이터 받고 -> Service에 요청 -> Dao 
	String mid = request.getParameter("mid");
	String pw = request.getParameter("password");
	
	String msg = "정상적으로 삭제되었습니다.";
	
	try{ // 들어오는 데이터에 따라서 처리 -> if 블럭과 같다.
	DeleteMessageService.getInstance().deleteMessage(Integer.parseInt(mid), pw);
		
	}catch (SQLException e){
		msg = "삭제하는 도중 문재가 발생했습니다. 다시 시도해주세요."; //앞에서 논리적인 예외를 만들어서 메세지만 출력해준다. 
		
	}catch(MessageNotFoundException e){
		msg = e.getMessage(); //메세지를 만들어놨기 때문에 불러오기만 한다. (논리적예외)
	} catch (invalidPasswordException e){
		msg = e.getMessage(); //메세지를 만들어놨기 때문에 불러오기만 한다. (논리적예외)
	}
	
	request.setAttribute("msg", msg);
	
%>
<!-- 삭제가 되고 결과 페이지를 보여준다 -->
<jsp:forward page="delete_view.jsp" />