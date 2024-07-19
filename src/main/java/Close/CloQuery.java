package Close;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CloQuery {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
	    Statement st=con.createStatement();
	    
	    st.executeUpdate("update user set name='prabhu' where id=4");
	    
	    System.out.println("data updated");
	    

	}

}
