<!DOCTYPE html>

<!--   SER516-Project2
  @author Janani Anand
  @since 02/19/2019 -->

<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}

input[type=submit] {
  width: 20%;
  background-color: #720c0c;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #961212;
}

.dropbtn {
  background-color: #720c0c;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.dropdown:hover .dropbtn {
  background-color: #961212;
}
</style>
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
  <ul>
    <li><a href="#news">DETAILS PAGE</a></li>
  </ul>

  <p>QUIZ TITLE</p>
  <div>
    <form action="ProfessorController" method="post">
      <input type="text" name="quiztitle" placeholder="Takes quiztitle">

      <p>QUIZ INSTRUCTIONS</p>
      <textarea name="qinstruct" rows="20" cols="100"></textarea>

      <p>SELECT THE QUIZ TYPE</p>
      <div class="dropdown">
        <button name="qtype" class="dropbtn">Quiz Type</button>
        <div class="dropdown-content">
          <a>MCQ</a>
        </div>
      </div>
      <br><br>
      <input type="hidden" name="action"
        value="ProfessorDash"> <input type="submit" value="CONTINUE">
      <input type="hidden" name="action" value="ProfessorDash1"> <input
        type="submit" value="CANCEL">
    </form>
  </div>
</body>
</html>