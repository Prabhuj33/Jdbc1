package CreateStatement;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;



public class StatementCall {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//		
//		CallableStatement c= con.prepareCall("call saveUser(5,'liyaaa','Mysore')");
//		
//		c.execute();
//		con.close();
//		System.out.println("data inserted sucessfully");
//		

	
//	
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//		
//		CallableStatement c= con.prepareCall("call updateUser(2,'Mani')");
//		
//		c.execute();
//		con.close();
//		System.out.println("data updated sucessfully");

		

		
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//		
//		CallableStatement c= con.prepareCall("call deleteUser(0)");
//		
//		c.execute();
//		con.close();
//		System.out.println("data deleted sucessfully");


		
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
		
		CallableStatement c= con.prepareCall("call selectUser(2)");
		
		c.execute();
		con.close();
		System.out.println("data fetched sucessfully");

	}


}
