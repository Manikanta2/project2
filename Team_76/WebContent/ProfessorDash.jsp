<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Professor</title>
</head>
<body>
	<%
		String uName = (String) session.getAttribute("uName");
		String isSessionValid = (String) session.getAttribute("validSession");
		if (isSessionValid == null || isSessionValid.isEmpty() || !isSessionValid.equalsIgnoreCase("True")
				|| uName == null || uName.isEmpty()) {
			response.sendRedirect("login.jsp");
		}
	%>
<h1>Welcome Professor</h1>
<form action="ProfessorController" method="post">
<input type="hidden" name="action" value="CreateQuiz">
<input type="submit" value="Create Quiz">
</form>

<form action="ProfessorController" method="post">
<input type="hidden" name="action" value="Questions">
<input type="submit" value="Questions">
</form>

	<div style="float: right">
		<form align="right" action="LoginController" method="post">
			<input type="hidden" name="action" value="logoff"> <input
				type="submit" value="LogOut" class="logout">
		</form>
	</div>

	<h1>Welcome Professor</h1>

	<form action="ProfessorController" method="post">
		<input type="hidden" name="action" value="CreateQuiz"> <input
			type="submit" value="Create Quiz">
	</form>

	<form action="ProfessorController" method="post">
		<input type="hidden" name="action" value="ViewQuiz"> <input
			type="submit" value="Create Quiz">
	</form>
</body>
</html>