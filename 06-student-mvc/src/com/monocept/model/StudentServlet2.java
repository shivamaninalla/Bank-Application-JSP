package com.monocept.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.entity.Student;


@WebServlet("/StudentServlet2")
public class StudentServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Student> s=(List<Student>) request.getAttribute("thedata");
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");

    System.out.println(s);
    RequestDispatcher req=request.getRequestDispatcher("view-student.jsp");
    req.forward(request, response);
	
	}



}
