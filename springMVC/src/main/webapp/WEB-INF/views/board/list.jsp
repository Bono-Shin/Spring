<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 목록</h2>
	
	${list.size() }
	
	<br>
	<table>
		<thead border="1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="a">
			<tr>
				<td>${a.bidx }</td>
				<td><a href="view.do?bidx=${a.bidx }">${a.subject }</a></td>
				<td>${a.writer }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>