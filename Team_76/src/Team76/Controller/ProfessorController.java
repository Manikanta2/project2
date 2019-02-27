package Team76.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfessorController")
public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ViewGradesController vc = new ViewGradesController();

    public ProfessorController() {
        super();
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doPost(request, response);
		  String action = request.getParameter("action");
		  
		  if(action.equals("ProfessorDash")) {
		  response.sendRedirect("ProfessorDash.jsp"); 
		  } 
		  if(action.equals("ViewGrades"))
		  { 
			  try { 
				  vc.getParameters(request, response); 
				  } 
			  catch (Exception e) {
				  e.printStackTrace(); 
				  } 
			  response.sendRedirect("ViewGrades.jsp"); 
		  }		 
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String action = request.getParameter("action");
		if (action == null || action.isEmpty()) {
			response.sendRedirect("login.jsp");
		}
		if(action.equals("CreateQuiz")) {
			response.sendRedirect("CreateQuiz.jsp");
		}
	}

}
