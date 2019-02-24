package Team76.Controller;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;*/

public class DatabaseQuestions {

	  public void databaseConnect(String question, String options, String answer) throws Exception {
	    String query = "INSERT INTO Question (Questions,Options,CORRECT_ANSWER) VALUES ' " + question  + " ' , '" + options +" ' , ' " + answer + " ' ";
	    
	    String user = "root";
	    String password = "pass123";
	    
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ser516p2?useSSL=false",user,password);

	    Statement stmt = con.createStatement();
	    PreparedStatement pstmt = con.prepareStatement(query);
	    int result = pstmt.executeUpdate();
	    System.out.println("result is " + result);
	    ResultSet rs = stmt.executeQuery(query);
	    
		
		  while (rs.next()) {
		   //for select queries
		  }
		 
	    con.close();
	  }
	  

	}
	

