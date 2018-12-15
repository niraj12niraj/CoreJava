package com.jlcindia.jdbc;


import java.sql.*;
public class JDBCUtil {
static {
	try{
		Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e){
		System.out.println(e);
	}
}
public static Connection getMSQLConnection()throws SQLException{
	String url="jdbc:mysql://localhost:3306/jlcdb";
	Connection con=DriverManager.getConnection(url,"root","niraj");
	return con;
}
public static void cleanup(Statement st,Connection  con){
	try{
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
public static void cleanup(ResultSet rs,Statement st,Connection  con){
	try{
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
		if(rs!=null)
			rs.close();
	}catch(Exception e){
		System.out.println(e);
	}
}

}
