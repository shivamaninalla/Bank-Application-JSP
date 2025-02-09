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


@WebServlet(name = "JDBCDemoEmployeePreparedConnection", urlPatterns = { "/JDBCDemoEmployeePreparedConnection" })
public class JDBCDemoEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
//			String query1="insert into employee values(?,?,?)";
//			PreparedStatement prepareStatement = conn.prepareStatement(query1);
//			prepareStatement.setString(1, "shiva");
//			prepareStatement.setInt(2, 1);
//			prepareStatement.setDouble(3, 25000);
//			prepareStatement.addBatch();
//			
//			prepareStatement.setString(1, "Mani");
//			prepareStatement.setInt(2, 2);
//			prepareStatement.setDouble(3, 35000);
//			prepareStatement.addBatch();
//			
//			prepareStatement.setString(1, "Cherry");
//			prepareStatement.setInt(2, 3);
//			prepareStatement.setDouble(3, 45000);
//			prepareStatement.addBatch();
//			
//			
//			int[] executeUpdate = prepareStatement.executeBatch();
//			System.out.println("Number of rows affected: "+executeUpdate);
			
			
//			String query2="update employee set id=? where id=?";
//			PreparedStatement prepareStatement = conn.prepareStatement(query2);
//			prepareStatement.setInt(1, 100);
//			prepareStatement.setInt(2, 10);
//			prepareStatement.addBatch();
//			
//			prepareStatement.setInt(1, 200);
//			prepareStatement.setInt(2, 2);
//			prepareStatement.addBatch();
//			
//			int[] executeBatch = prepareStatement.executeBatch();
//			System.out.println("Number of rows: "+executeBatch);
			
			String query3="delete from employee where id=?";
			PreparedStatement prepareStatement = conn.prepareStatement(query3);
			prepareStatement.setInt(1, 200);
			int executeUpdate= prepareStatement.executeUpdate();
			System.out.println("Number of rows deleted: "+executeUpdate);
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
