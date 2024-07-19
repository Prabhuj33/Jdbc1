package CreateStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class SecondWayPreparedStatement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//insert
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
//		
//		PreparedStatement pre=con.prepareStatement("insert into student values(?,?,?)");
//		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter the id");
//		int id=s.nextInt();
//		
//		System.out.println("Enter your name");
//		String name=s.next();
//		
//		System.out.println("Enter the Address");
//		String address=s.next();
//		
//		
//		pre.setInt(1, id);
//		pre.setString(2, name);
//		pre.setString(3, address);
//		
//		pre.execute();
//		con.close();
//		System.out.println("data inserted");
		
		
		
		//update
		
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
//		
//		PreparedStatement pre=con.prepareStatement("update student set name=?where id=?");
//		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter the student name");
//		String name=s.next();
//		
//		System.out.println("Enter the student id");
//		int id=s.nextInt();
//		
//		
//		pre.setString(1, name);
//		pre.setInt(2, id);
//		
//		
//		pre.execute();
//		
//		con.close();
//		
//		System.out.println("data updated scusccefully");
		
		
		
		
		//delete
		
//		
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
//		
//		
//		PreparedStatement pre=con.prepareStatement("delete from student where id=?");
//		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter the student id");
//		int id=s.nextInt();
//		
//		pre.setInt(1, id);
//		
//		pre.execute();
//		
//		con.close();
//		
//		System.out.println("data deleted");
		
		
		
		//select
		
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
//		
//		PreparedStatement pre=con.prepareStatement("select * from student where id=?");
//		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter the student id");
//		int id=s.nextInt();
//		
//		pre.setInt(1, id);
//		
//		ResultSet r= pre.executeQuery();
//		
//		while(r.next())
//		{
//			System.out.println(r.getInt(1));
//			System.out.println(r.getString(2));
//			System.out.println(r.getString(3));
//			
//			
//		}
//		pre.execute();
//		con.close();
//		System.out.println("data fetched sucessfully");
	

		
		//multi values inserted
		
//        Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
//		
//		PreparedStatement pre=con.prepareStatement("insert into student values(?,?,?)");
//		
//		Scanner s=new Scanner(System.in);
//	
//		System.out.println("Enter the no of entries will be provided");
//		int entries=s.nextInt();
//		
//		int i=0;
//		
//		while(entries>i)
//		{
//			System.out.println("Enter the id");
//			int id=s.nextInt();
//			
//			System.out.println("Enter the name");
//			String name=s.next();
//			
//			System.out.println("Enter the address");
//		    String Address=s.next();
//		    
//		    pre.setInt(1, id);
//		    pre.setString(2, name);
//		    pre.setString(3, Address);
//		    
//		    pre.execute();
//		    i++;
//		
//		}
//	
//		con.close();
//		System.out.println("data inserted ");
//	

	
	
	
	//multi values selected
		
       
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
//		
//		PreparedStatement pre=con.prepareStatement("select * from student");
//		
//		ResultSet r=pre.executeQuery();
//		
//		while(r.next())
//		{
//			System.out.println(r.getInt(1));
//			System.out.println(r.getString(2));
//		    System.out.println(r.getString(3));
//		    
//		}
//	
//		pre.execute();
//		con.close();
//		System.out.println("data fetched sucessfully");
		
		
		// add batch
		
		
		
       Class.forName("com.mysql.cj.jdbc.Driver");
		
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","T#9758@qlph");
		
	   PreparedStatement pre=con.prepareStatement("insert into student values(?,?,?)");
	   
	   Scanner s=new Scanner(System.in);
	   
	   System.out.println("Enter the no of entries will be provided");
	   int entries=s.nextInt();
	   
	   int i=0;
	   
	   while(entries>i)
	   {
		   System.out.println("Enter the id");
		   int id=s.nextInt();
		   
		   System.out.println("Enter the name");
		   String name=s.next();
		   
		   System.out.println("Enter the Address");
		   String Address=s.next();
		   
		   pre.setInt(1, id);
		   pre.setString(2, name);
		   pre.setString(3, Address);
		   
		   pre.addBatch();
		   i++;
	   }
	
	    pre.executeBatch();
	    con.close();
	    System.out.println("data's all addded in batch format");
	}
	

}
