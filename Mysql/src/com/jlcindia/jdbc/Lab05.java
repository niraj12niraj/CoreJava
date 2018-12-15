package com.jlcindia.jdbc;
import java.sql.*;
import com.jlcindia.jdbc.util.*;
public class Lab05 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMSQLConnection();
			String qry="select*from jlcstudents";
			st=con.createStatement();
			rs=st.executeQuery(qry);
			if(rs.next()){do{
			int sid=rs.getInt(1);
			String nm=rs.getString(2);
			String eml=rs.getString(3);
			long phn=rs.getLong(4);
			System.out.println(sid+"\n"+nm+"\n"+eml+"\n"+phn);
			}while(rs.next());
			}else
				System.out.println("No Record Found");
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs,st, con);
		}
	}

}
