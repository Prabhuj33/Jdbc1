package LoadandRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SecondWay {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Driver d=new Driver(); //load the driver

		DriverManager.registerDriver(d);//register the driver

	  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
		
		Statement st=con.createStatement();
		st.execute("insert into student values(2,'ramya','chennai')");
		con.close();
		System.out.println("student values inserted for second way ");
		
	
	
	}

}
