package com.jlcindia.jdbc;
import java.sql.*;

public class Lab04 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			con=JDBCUtil.getMSQLConnection();
			String qry="insert into jlcstudents values(75,'Rivas',tyvas@jlc',45131546)";
			st=con.createStatement();
			int x=st.executeUpdate(qry);
			if(x==1)
				System.out.println("Record Inserted");
			else
				System.out.println("Record Not Inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(st, con);
		}
	}

}
