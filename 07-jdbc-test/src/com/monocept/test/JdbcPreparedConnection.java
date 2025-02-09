package com.monocept.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JdbcPreparedConnection")
public class JdbcPreparedConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
//		String query="insert into student values (?,?,?)";
		
//		
//		stmt.setInt(2, 20);
//		stmt.setString(1,"shivudu");
//		stmt.setInt(3, 25);
//		
//		
//		int executeUpdate = stmt.executeUpdate();
//		System.out.println("Number of rows affected: "+executeUpdate);
		
		
//		String query2="update student set id=? where name=?";
//		PreparedStatement stmt=conn.prepareStatement(query2);
//		
//		stmt.setInt(1,100);
//		stmt.setString(2, "shivudu");
//		boolean execute = stmt.execute();
//		
//		System.out.println("Number of rows affected: "+execute);
			
		String query3="delete from student where id=?";
		PreparedStatement stmt=conn.prepareStatement(query3);
		stmt.setInt(1, 100);
		boolean execute = stmt.execute();
		System.out.println("Number of rows affected: "+execute);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	

}
