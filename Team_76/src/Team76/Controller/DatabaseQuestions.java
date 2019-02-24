package Team76.Controller;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;*/

public class DatabaseQuestions {

	  public void databaseConnect(String query) throws Exception {

	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ser516p2?useSSL=false","root","pass123");
	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery(query);
	    while (rs.next()) {
	    	
	      String name = rs.getString("status");
	      System.out.println("name " + name);
//	      String desc = rs.getString("Description");
//	      int qty = rs.getInt("Qty");
//	      float cost = rs.getFloat("Cost");
//	      System.out.println(name + ", " + desc + "\t: " + qty + "\t@ $" + cost);
	    }
	    con.close();
	  }
	}


