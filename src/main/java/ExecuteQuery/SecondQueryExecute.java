package ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class SecondQueryExecute {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		//only for DQL(select)== proceduce result
		
		Class.forName("com.mysql.cj.jdbc.Driver");

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
	    Statement st=con.createStatement();
	  
	    ResultSet r=st.executeQuery("select * from user");
	    
	    if(r.next())
	    {
	    	System.out.println(r.getInt(1));
	    	System.out.println(r.getString(2));
	    	System.out.println(r.getString(3));
	    	
	    }
	    
	  System.out.println("data fetched sucessfully");

	
	
//   		Class.forName("com.mysql.cj.jdbc.Driver");
//
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//	    Statement st=con.createStatement();
//	    ResultSet r= st.executeQuery("select * from user");
//	    while(r.next())
//	    {
//	    	System.out.println(r.getInt(1));
//	    	System.out.println(r.getString(2));
//	    	System.out.println(r.getString(3));
//	    }
//	    
//	    con.close();
//	    System.out.println("data fetched sucessfully ");
//	    

	
	
	}

}
