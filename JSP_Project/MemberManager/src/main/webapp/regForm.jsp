<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath()%>/css/default.css">
<style>
	.display_none {
		display: none;
	}
	.color_blue {
	
		color : blue;
	}
	.color_red {
		color : red;
	}
	#loadingimg {
		height : 20px; /* 사이즈 축소 시 비율 유지 됨 */
	}
</style>
<script scr = "http://code.jquery.com/jquery-1.12.4.min.js"></script>

<script>
	$(document).ready(function() {
		$('#memberid').focusin(function() {
			$('#msg').addClass('display_none');
			$('#msg').removeClass('color_blue');
			$('#msg').removeClass('color_red');
			
			$(this).val('');
		});
		
		$('#memberid').focusout(function() {
			//ajax 비동기 통신 -> id를 서버로 보내고 사용 가능 유무의 응답 코드를 받는다(Y/N) -> 화면에 메시지 출력
			$.ajax({
				url : 'idcheck.jsp',
				type : 'post';
				data : {
					mid : $(this).val()
				},
				beforeSend : function() { //보내기 전
					#('#loadingimg').removeClass('display_none');
				},
				success : function(data) { //성공시
					//data : Y / N
					if(data == 'Y') { // Y : 사용가능한 아이디
						$('#msg').html('사용 가능');
						$('#msg').addClass('color_blue');
						$('#msg').removeClass('display_none');
					} else {
						$('#msg').html('사용 불가능');
						$('#msg').addClass('color_red');
						$('#msg').removeClass('display_none');
					}
				},
				error : function(request, status, error) {
					alert('서버 통신에 문제가 발생했습니다.\n다시 실행해주세요.')
					console.log(request);
					console.log(status);
					console.log(error);
				},
				complete : function() { //success나 error가 진행되고 난 마지막
					$('#loadingimg').addClass('display_none');
				}
				
			});
		});
	});
	
</script>
</head>


<body>

	<%@ include file="/WEB-INF/frame/header.jsp"%>

	<%@ include file="/WEB-INF/frame/nav.jsp"%>

	<div class="contents">

		<h2>회원가입</h2>
		<hr>
		<form action="memberReg.jsp" method="post" enctype="multipart/form-data"> 
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input id="memberid"type="text" name="memberid">
						<span id="msg" class="display_none"></span>
						<img id="loadingimg" class="display_none" alt="loading" src="<c:url value="/image/loading.gif"/>">
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="membername"></td>
				</tr>
				<tr>
					<td>사진</td>
					<td><input type="file" name="photo"></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit">
						<input type="reset" >
					</td>
				</tr>
			</table>
		</form>


	</div>


</body>
</html>