<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>response</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="GENERATOR" content="Rational Software Architect">
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
	<div style=“float: right”>
        <form align=“right” action=“LoginController” method=“post”>
            <input type=“hidden” name=“action” value=“logoff”> <input
                type=“submit” value=“LogOut” class=“logout”>
        </form>
    </div>
    
	<h2 align="center"><font><strong>Available Quizzes</strong></font></h2>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
	<tr></tr>
	<tr bgcolor="#A52A2A">
		<td><b>Professor Id</b></td>
		<td><b>Quiz Id</b></td>
		<td><b>Quiz Status</b></td>
		<td><b>Due Date</b></td>
		<td><b>Time Limit</b></td>
		<td><b>Quiz Type</b></td>
	</tr>
	<c:forEach items="${quzzes}" var="quiz">
    		<tr bgcolor="yellow">
        		<td>${quiz.getProfessorId()}</td>
        		<td>${quiz.getQuizId()}</td>
        		<td>${quiz.getQuizStatus()}</td>
        		<td>${quiz.getDueDate()}</td>
        		<td>${quiz.getTimeLimit()}</td>
        		<td>${quiz.getQuizType()}</td>
        		<td>
        			<form action="StudentController" method="get">
						<input type="hidden" name="action" value="StartQuiz">
						<input type="hidden" name="quizId" value="${quiz.getQuizId()}">
						<input type="submit" value="Start"></td>
					</form>
    			</tr>
	</c:forEach>
	</table>
</body>

</html:html>