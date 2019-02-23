<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>		
	<h1>This is Student DashBoard.</h1>
	
	<form action="StudentController" method="get">
		<input type="hidden" name="action" value="AttemptQuiz">
		<input type="submit" value="Attempt Quiz">
	</form>
	
	<form action="StudentController" method="get">
		<input type="hidden" name="action" value="ViewGrade">
		<input type="submit" value="View Grade">
	</form>
	
</body>
</html>