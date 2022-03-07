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
				<td>${vo.subject }</td>
				<th>작성자</th>
				<td>${vo.writer }</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>내용</th>
				<td colspan="5">${vo.content }</td>
			</tr>
		</tbody>
	</table>
	<button onclick="location.href='modify.do?bidx=${vo.bidx}'">수정</button>
	<form method="post">
		<button onclick="del(); return false;">삭제</button>
		<input type="hidden" name="bidx" value="${vo.bidx }">
	</form>
	<script>
		function del(){
			var form = document.getElementsByTagName("form")[0];
			form.setAttribute("action","delete.do");
			form.submit();
		}
	</script>
</body>
</html>