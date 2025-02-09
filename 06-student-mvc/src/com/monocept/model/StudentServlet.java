package com.monocept.model;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.entity.Student;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Student> students=StudentDataUtil.getStudents();
		request.setAttribute("thedata", students);
		//RequestDispatcher req=request.getRequestDispatcher("view-student.jsp");
		
		RequestDispatcher req1=request.getRequestDispatcher("StudentServlet2");
		req1.forward(request, response);
	}

}
