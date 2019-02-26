package Team76.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class ProfessorController
 * If action equals CreateQuiz, goes to details page,
 * continues to questions page if action is ProfessorDash1
 */
@WebServlet("/ProfessorController")
public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DetailsController q = new DetailsController(); // object of quiz class used for calling fetch method

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProfessorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		String action = request.getParameter("action");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action == null || action.isEmpty()) {
			response.sendRedirect("login.jsp");
		}
		if (action.equals("CreateQuiz")) {
			response.sendRedirect("CreateQuiz.jsp");
		}
		if (action.equals("ProfessorDash")) {
			try {
				q.getParameters(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("ProfessorDash.jsp");
		}

		if (action.equals("ProfessorDash1")) {
			response.sendRedirect("Questions.jsp"); 
		}
		/*
		 * if(request.getSession()==null) 
		 *    System.out.println("Session worked");
		 */	
	}
}
