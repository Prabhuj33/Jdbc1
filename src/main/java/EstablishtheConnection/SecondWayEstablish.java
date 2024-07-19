package EstablishtheConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SecondWayEstablish {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Driver d=new Driver();
		DriverManager.registerDriver(d);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider?user=root&password=T#9758@qlph");
		
		Statement st=con.createStatement();
		st.execute("insert into student values(10,'charu','bangalore')");
		con.close();
		System.out.println("deleted sucessfully"); 

		
	}

}
