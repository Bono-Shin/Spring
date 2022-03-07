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
	<form action="modify.do" method="post">
	<table border="1">
		<input type="hidden" name="bidx" value="${vo.bidx }">
		<thead>
			<tr>
				<th>번호</th>
				<td>${vo.bidx }</td>
				<th>제목</th>
				<td><input type="text" name="subject" value="${vo.subject }"></td>
										<!-- name은 vo 필드네임과 같게 한다 -->
				<th>작성자</th>
				<td>${vo.writer }</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>내용</th>
				<td colspan="5"><textarea name="content">${vo.content }</textarea></td>
			</tr>
		</tbody>
	</table>
	<button>저장</button>
	</form>
</body>
</html>