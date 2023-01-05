<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user2::list</title>
	</head>
	<body>
		<h3>목록</h3>
		<a href="/Ch05">Ch05 메인</a>
		<a href="/Ch05/user2/register">user2 등록</a>
		<table border="1">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>휴대폰</th>
				<th>나이</th>
				<th>관리</th>
			</tr>
			<tr>
				<th>홍길동</th>
				<th>홍길동</th>
				<th>홍길동</th>
				<th>홍길동</th>
				<th>
					<a href="/Ch05/user2/modify">수정</a>
					<a href="/Ch05/user2/delete">삭제</a>
				</th>
			</tr>
		</table>
		
	</body>
</html>