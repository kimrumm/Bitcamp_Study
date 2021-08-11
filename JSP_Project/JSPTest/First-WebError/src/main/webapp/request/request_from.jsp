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

	<h1>request From Test</h1>
	<hr>
	<!-- 데이터를 처리할 위치로 전송 -->
	
	<form></form>
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><select>
					<option>시스템엔지니어</option>
					<option>자바 프로그래머</option>
					<option>그래픽 디자이너</option>
			</select>
			</td>
		</tr>
		<tr>
			<td>관심사항</td>
			<td><input type="checkbox"> java
			<td><input type="checkbox"> css3
			<td><input type="checkbox"> javascript
			<td><input type="checkbox"> jsp
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit"> <input type="reset">
			</td>
			<td><input type="text"></td>
		</tr>
	</table>

</body>
</html>