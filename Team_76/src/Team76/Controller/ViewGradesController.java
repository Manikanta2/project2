package Team76.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* SER-516 Software Agility
* Displays the grade of the selected student using ViewGrades.JSP
* @author Manikanta Chintakunta, mchintak@asu.edu
* @version 1.0
* @since 02-15-19
*/

public class ViewGradesController {
	mySQL obj = new mySQL();
	/* This retrieves the request and response parameters from the UI.
	 */
	public void getParameters(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String quizTitle = request.getParameter("quizTitle");
		String studentName = request.getParameter("studentName");
		System.out.println("This is my title"+ request.getParameter("quizTitle"));
		System.out.println("This is my name"+ request.getParameter("studentName"));
		obj.connection("SELECT grade FROM grade WHERE studentName= '" + studentName + "' quizTitle = '" + quizTitle +"'");
	}
}
