package com.monocept.jbdb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/TestConnectionPool")
public class TestConnectionPool extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/studentdb")
	private DataSource dataSource;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try(Connection conn = dataSource.getConnection();
			Statement stmt=conn.createStatement();) {
			
			String sql="select * from student";
			ResultSet e = stmt.executeQuery(sql);
			while(e.next()) {
				String name=e.getString("name");
				System.out.println("name: "+name);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
}
