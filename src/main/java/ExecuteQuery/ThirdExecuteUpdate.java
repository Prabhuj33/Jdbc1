package ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ThirdExecuteUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//DMl(insert,update,delete)
		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//	    Statement st=con.createStatement();
//	 
//	    int value=st.executeUpdate("insert into user values(10,'priya','chennai')");
//	    
//	    con.close();
//	    System.out.println("data inserted sucessfully");
//	    System.out.println(value);
		
		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//	    Statement st=con.createStatement();
//	    
//	    int value=st.executeUpdate("update user set name='prabhu' where id=10");
//	    con.close();
//	    System.out.println("data updated");
//	    System.out.println(value);
		

		Class.forName("com.mysql.cj.jdbc.Driver");

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
	    Statement st=con.createStatement();
	    
	    int value=st.executeUpdate("delete from user  where id=10");
	    con.close();
	    System.out.println("data deleted");
	    System.out.println(value);
	
	}

}
