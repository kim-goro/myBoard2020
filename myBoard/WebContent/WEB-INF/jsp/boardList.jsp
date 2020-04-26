<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
	<div>
		${ loginUser.u_nickname }님 환영합니다.
		<a href="/boardRegmod">
			<button>글쓰기</button>
		</a>
	</div>
	<div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>조회수</th>
				<th>작성일</th>
				<th>작성자</th>
			</tr>
			
			<c:forEach var="item" items="${list}">
			
			</c:forEach>
		</table>
	</div>
</body>
</html>