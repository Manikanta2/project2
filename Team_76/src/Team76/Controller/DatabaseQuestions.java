package Team76.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseQuestions {

	  public static void main(String args[]) throws Exception {
	    String query = "SELECT * from quiz";

	    Class.forName("com.mysql.jdbc.driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Nikhila");
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(query);
	    while (rs.next()) {
	    	
	      String name = rs.getString("status");
//	      String desc = rs.getString("Description");
//	      int qty = rs.getInt("Qty");
//	      float cost = rs.getFloat("Cost");
//	      System.out.println(name + ", " + desc + "\t: " + qty + "\t@ $" + cost);
	    }
	    con.close();
	  }
	}
	

