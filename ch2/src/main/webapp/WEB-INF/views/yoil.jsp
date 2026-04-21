<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	year=<%=request.getParameter("year")%>
	<p>${myDate.year }년 ${myDate.month }월 ${myDate.day }일은 ${yoil }입니다.</p>
</body>
</html>