<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디테일</title>
</head>
<body>
	<div>제목: ${detail.title }</div>
	<div>조회수: ${detail.hits }</div>
	<div>작성일시: ${detail.r_dt }</div>
	<div>수정일시: ${detail.m_dt }</div>
	<div>작성자: ${detail.u_nickname }</div>
	<div>내용</div>
	<div>${detail.content }</div>
</body>
</html>