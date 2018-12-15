package com.jlcindia.jdbc;
import java.sql.*;
public class Lab01 {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	try{
		//1-Load the Driver class
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//2-Establish the Connection
		con=DriverManager.getConnection("jdbc:Odbc:JLCMYDSN","root","niraj");
		//3-Prepare the Sql Statement
		String st1="insert into jlcstudents values(90,'Raju','laj@jlc',44764654)";
		//4-Create the JDBc Statement
		st=con.createStatement();
		//5-Submit the Sql Statement to Database using JDBC Statement
		int x=st.executeUpdate(st1);
		//6-Process the result
		if(x==1){
			System.out.println("Record Inserted");
		}else{
			System.out.println("Record Not Inserted");
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		//7-Close all the resources
		try{
			if(st!=null)
				st.close();
			if(con!=null)
				con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
