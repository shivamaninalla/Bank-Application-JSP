package com.monocept.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JDBCDemo")
public class JDBCDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			Statement stmt = conn.createStatement();
//			String insertQuery = "insert into student(name,percentage,id) values('shiva',20,2),"
//					+ "('Mani',21,3)";
//
//			int res = stmt.executeUpdate(insertQuery);

//			String query="delete from student where id=2";
//			boolean res1=stmt.execute(query);

			// System.out.println("no of rows: " + res);
			// System.out.println("res1:"+res1);

//			String query2 = "update student set id=10 where id=3";
//			boolean res2 = stmt.execute(query2);
//			System.out.println("res2: " + res2);

//			String insert = "insert into student(name,percentage,id) values('saikiran',1,10), ('cherry',2,11) ,('nikhil',3,12) ,('ganesh',4,13)";
//			int insertq = stmt.executeUpdate("insert");
//			System.out.println("rows inserted" + insertq);
			
//			String insertQuery="insert into student"
//			          + "values('shiva',2,20),('cherry',3,30)";
//			int insertq = stmt.executeUpdate("insertQuery");
//     		System.out.println("rows inserted" + insertq);
			
//			String insertQuery="insert into student1(rollnumber,name,pecentage)"+"values(7,'ronaldo',90),(18,'virat',98)";
//			int executeUpdate= stmt.executeUpdate(insertQuery);
// System.out.println("number of rows  affected"+executeUpdate);
//			 String insertQuery = "INSERT INTO student (name, percentage, id) VALUES " +
//                     "('saikiran', 1, 10), " +
//                     "('cherry', 2, 11), " +
//                     "('nikhil', 3, 12), " +
//                     "('ganesh', 4, 13)";
//			 int executeUpdate= stmt.executeUpdate(insertQuery);
//			System.out.println("number of rows  affected"+executeUpdate);
			 
//
		String s="select * from student";
		ResultSet r = stmt.executeQuery(s);
		while(r.next()) {
			int name=r.getInt("id");
			System.out.println(name);
		}
//		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
