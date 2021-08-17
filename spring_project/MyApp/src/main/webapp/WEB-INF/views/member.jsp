<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>


	$(document).ready(function() {
		
		$.ajax({
			url : 'http://localhost:8080/op/members',
			
		})
		
	});
	
</script>
</head>
<body>

	<h1>회원 리스트</h1>
	<hr>
	<div id="memberlsit">
	
	</div>	
	

</body>
</html>