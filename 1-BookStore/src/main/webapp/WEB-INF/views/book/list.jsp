<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>타이틀</title>
	</head>
	<body>
		<h3>도서목록</h3>
		<a href="/BookStore">처음으로</a>
		<a href="/BookStore/book/register">도서등록</a>
		
		<table border="1">
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>출판사</th>
				<th>가격</th>
				<th>관리</th>
			</tr>
			<tr>
				<th>12</th>
				<th>12</th>
				<th>12</th>
				<th>12</th>
				<th>
					<a href="/BookStore/book/modify">수정</a>
					<a href="/BookStore/book/delete">삭제</a>
				</th>
			</tr>
		</table>
		
	</body>
</html>