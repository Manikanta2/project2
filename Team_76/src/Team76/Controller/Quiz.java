package Team76.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Quiz {

	public Quiz() {
		// TODO Auto-generated constructor stub
	}

     public void fetch(HttpServletRequest request, HttpServletResponse response)
	  {
		String quiztitle =  request.getParameter("quiztitle");
		String qinstruct =  request.getParameter("qinstruct");
		//String qtype =  request.getParameter("qtype");
		System.out.println("Quiz title- \n" + quiztitle);
		System.out.println("Instructions- \n" + qinstruct);
	  }
	
	
}
