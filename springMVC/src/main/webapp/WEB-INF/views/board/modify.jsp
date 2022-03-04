<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<td>${vo.bidx }</td>
				<th>제목</th>
				<td><input type="text" value="${vo.subject }"></td>
				<th>작성자</th>
				<td>${vo.writer }</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>내용</th>
				<td colspan="5"><textarea>${vo.content }</textarea></td>
			</tr>
		</tbody>
	</table>
	<button>취소</button>
	<button>저장</button>
</body>
</html>