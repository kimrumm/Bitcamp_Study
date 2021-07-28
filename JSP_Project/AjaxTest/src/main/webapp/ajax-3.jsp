<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script scr="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<style>
</style>
<script>

	$(document).ready(function(){
		
		$.ajax('data.html',{
			url : 'parameter.hrml',
			type : 'get', // http method get, post, put, delete
			data : {
				pname : '우유',
				price : 1000
			} , // 문자열 형식 
				success : function(date){
					$('body').html(date);
				}
			}
		})';
	});


</script>
</head>
<body>
ajax-1.jsp
</body>
</html>