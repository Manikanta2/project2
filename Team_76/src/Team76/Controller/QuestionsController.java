package Team76.Controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuestionsController {
	List<QuestionEntity> questionsList;
	
	public void getParameters(HttpServletRequest request, HttpServletResponse response) throws Exception {
		questionsList = new ArrayList();
		DatabaseQuestions database =  new DatabaseQuestions();
		QuestionEntity entity = new QuestionEntity();
		
		entity.setQuestion(request.getParameter("question"));
		entity.setOption1(request.getParameter("option1"));
		entity.setOption2(request.getParameter("option2"));
		entity.setOption3(request.getParameter("option3"));
		entity.setOption4(request.getParameter("option4"));
		String concatoptions= entity.getOption1();
		concatoptions=concatoptions.concat("&&").concat(entity.getOption2()).concat("&&").concat(entity.getOption3()).concat("&&").concat(entity.getOption4());


		entity.setAnswer(request.getParameter("correctanswer"));
		entity.setMarks(request.getParameter("marks"));
		
		questionsList.add(entity);
	 	System.out.println("Entity is " + entity.toString());
	 	database.databaseConnect(entity.getQuestion(),concatoptions,entity.getAnswer());
		request.getSession().setAttribute("question", questionsList);
		List<QuestionEntity> question=  (List<QuestionEntity>) request.getSession().getAttribute("question");
	
	}
	
}
