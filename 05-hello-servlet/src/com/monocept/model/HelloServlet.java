package com.monocept.model;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet method");
		String n=request.getParameter("name");
		String a=request.getParameter("age");
		response.setContentType("text/html");
		
		ServletContext context=getServletContext();
		String initParameter=context.getInitParameter("context");
		
		
		PrintWriter out=response.getWriter();
		out.println(initParameter);
		
		out.println("hello: "+n);
		out.println("Your age is: "+a);
		
	}

	

}
