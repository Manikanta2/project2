package Team76.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionsController {
	
	
	public void getParameters(HttpServletRequest request, HttpServletResponse response) {
		String question =  request.getParameter("question");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		String answer = request.getParameter("correctanswer");
		System.out.println("Questions are: " + question);
		System.out.println("Options are: " + option1);
		request.getSession().setAttribute("question", question);
		String responsfinal = (String) request.getSession().getAttribute(question);
		System.out.println("session is : " + responsfinal);
	}
}
