<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/header.css" rel="stylesheet" />
</head>
<body>
	<h2>게시글 목록</h2>
	
	${list.size() }
	
	<br>
	<form action="list.do" method="get">
		<select name="searchType">
			<option value="subject">글제목</option>
			<option value="writer">작성자</option>
		</select>
		<input type="text" name="searchValue">
	</form>
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
	<button onclick="location.href='insert.do'">등록</button>
	
</body>
</html>