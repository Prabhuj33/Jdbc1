package ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirtExecuteQury {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//DML(insert,update,delete)==false values
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//	    Statement st=con.createStatement();
//	   boolean v= st.execute("insert into user values(4,'latha','lalkudi')");
//	    con.close();
//	    System.out.println("data insert sucessfully with depencies");
//	    System.out.println(v);

		
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//	    Statement st=con.createStatement();
//	   boolean v= st.execute("update user set name='kanmani'where id=2");
//	    con.close();
//	    System.out.println("update sucessfully with depencies");
//	    System.out.println(v);


		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
//	    Statement st=con.createStatement();
//	   boolean v= st.execute("delete from user where id=10");
//	    con.close();
//	    System.out.println("data delete sucessfully with depencies");
//	    System.out.println(v);
		
		
		
		
		//DQL(select)===True
		
		Class.forName("com.mysql.cj.jdbc.Driver");

	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","T#9758@qlph");
	    Statement st=con.createStatement();
        boolean v= st.execute("select * from user where  id=4");
	    con.close();
	    System.out.println("data fetched sucessfully with depencies");
	    System.out.println(v);


		
		
		
		
		
	}

}
