package EstablishtheConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstWayEstablish {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
		Statement st=con.createStatement();
		st.execute("update student set address='lakno'where id=1");
		con.close();
		System.out.println("establish connection sucessfully");
	}
	

}
