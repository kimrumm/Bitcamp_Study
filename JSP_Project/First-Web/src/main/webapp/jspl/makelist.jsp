<%@page import="java.util.ArrayList"%>
<%@page import="member.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	List<Member> members = new ArrayList<Member>();
	members.add(new Member("cool00","1110", "COOL00"));
	members.add(new Member("cool10","1111", null));
	members.add(new Member("cool20","1112", "COOL00"));
	members.add(new Member("cool30","1113", "COOL00"));
	members.add(new Member("cool40","1114", null));
	members.add(new Member("cool50","1115", null));
	members.add(new Member("cool60","1116", "COOL00"));
	members.add(new Member("cool70","1117", null));
	members.add(new Member("cool80","1118", "COOL00"));
	members
	.add(new Member("cool90","1119", "COOL00"));
	
	session.setAttribute("members", members);
%>

