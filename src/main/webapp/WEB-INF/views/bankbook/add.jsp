<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add BankBook</title>
<style type="text/css">
	#sendButton{
		background-color: aqua;
		margin: 10px 10px 10px 10px;
		padding: 10px;
		border: none;
		width: 150px;
		font-size: 20px;
		cursor: pointer;
	}
	.boxes{
		margin: 10px 10px 10px 10px;
		font-size: 20px;
	}
</style>
</head>
<body>
	<h1>통장 추가 페이지</h1>
	
	<form method="post" action="add">
		<input class="boxes" type="text" name="bookName" placeholder="BookName"><br>
		<input class="boxes" type="text" name="bookRate" placeholder="BookRate"><br>
		<input id="sendButton" type="submit" value="생성">
	</form>
	
</body>
</html>