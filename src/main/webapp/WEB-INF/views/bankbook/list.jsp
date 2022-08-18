<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BankBook List</title>
<style type="text/css">
	#listTable{
		border: 1px;
		margin: 10px 10px 10px 10px;
		padding: 10px;
		text-align: center;
	}
	.listTd{
		border: 1px;
		border-color: gray;
		border-style: solid;
		margin: 10px 10px 10px 10px;
		padding: 10px;
		font-size: 20px;
	}
	.listHead{
		background-color: aqua;
	}
</style>
</head>
<body>
	<h1>통장 목록 페이지</h1>
	
	<table id="listTable">
		<thead>
			<tr>
				<td class="listTd listHead">Number</td>
				<td class="listTd listHead">Name</td>
				<td class="listTd listHead">Rate</td>
				<td class="listTd listHead">Sale</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.bankbookList }" var="dto">
				<tr>
					<td class="listTd">${pageScope.dto.bookNum }</td>
					<td class="listTd">${pageScope.dto.bookName }</td>
					<td class="listTd">${pageScope.dto.bookRate }</td>
					<td class="listTd">${pageScope.dto.bookSale }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<br>
	<a href="/">메인페이지</a>
	
</body>
</html>