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


	<h1>파일 업로드</h1>
	
<!-- 	
	필수 1 : form tag 속성 method="post"
	필수 2 : form tag 속성 enctype="multipart/form-data" / multipart 잘 기억하기 !(스프링)
	필수 3 : input type="file" 있어야 한다 !!!!  
	-->
	
	<form action="upload.jsp" method="post" enctype="multipart/form-data" >
		
		제목 <input type="text1" name="title"> <br>
		제목2 <input type="text2" name="title2"> <br>
		파일 <input type="file" name="photo">
		파일 <input type="file" name="photo">
		<input type="submit">
	</form>

</body>
</html>