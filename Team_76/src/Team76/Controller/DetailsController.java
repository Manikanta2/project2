package Team76.Controller;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailsController {

	public DetailsController() {
		// TODO Auto-generated constructor stub
	}
	
	public void getParameters(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DatabaseQuestions database =  new DatabaseQuestions();
		DetailsEntity entity = new DetailsEntity();
		entity.setQuiztitle(request.getParameter("quiztitle"));
        entity.setQinstruct(request.getParameter("qinstruct"));
        entity.setQtype(request.getParameter("qtype"));
		System.out.println("Entity is " + entity.toString());
		
		database.databaseConnect("INSERT INTO quiz (quiztitle, qinstruct, qtype) VALUES" + entity.getQuiztitle() + "," + entity.getQinstruct() + ","+ entity.getQtype());
	
	}	
}
