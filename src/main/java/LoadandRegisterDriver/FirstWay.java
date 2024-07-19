package LoadandRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstWay {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
		Statement st=con.createStatement();
		st.execute("insert into student values(1,'prabhu','Trichy')");
		con.close();
		System.out.println("student data inserted successfully");
		
	}
}
