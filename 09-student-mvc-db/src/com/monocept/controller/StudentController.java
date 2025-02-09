package com.monocept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.model.dao.StudentDbUtil;
import com.model.entity.Student;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/studentdb")
	private DataSource dataSource;

	private StudentDbUtil studentDbUtil;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		studentDbUtil = new StudentDbUtil(dataSource);
	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Student> studentList;
		try {
			studentList = studentDbUtil.getStudents();
			System.out.println(studentList);
			request.setAttribute("data", studentList);
			RequestDispatcher req = request.getRequestDispatcher("viewstudent.jsp");
			req.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String command;
		command = request.getParameter("command");
		if (command == null) {
			command = "list";
		}
		switch (command) {

		case "add":
			addStudent(request, response);
			break;
		case "load":
			loadStudent(request, response);
			break;
		case "update":
			updateStudent(request, response);
			break;
		case "delete":
			deleteStudent(request, response);
			break;
		case "search":
			searchStudent(request, response);
			break;
		default:
			list(request, response);
			break;
		}

	}

	private void searchStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int id1 = 0;
		try {
			if (id != null && !id.isEmpty()) {
				id1 = Integer.parseInt(id);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		List<Student> student = StudentDbUtil.searchStudentDb(id1);

		System.out.println(student);
		request.setAttribute("data", student);
		//request.forward(request, response);
		//response.sendRedirect(request.getContextPath() + "/StudentController");
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewstudent.jsp");
	    dispatcher.forward(request, response);
		
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int percentage = Integer.parseInt(request.getParameter("percentage"));
		Student student1 = new Student(name, percentage, id);
		System.out.println(name);
		boolean update = studentDbUtil.updateStudentToDb(student1);
		System.out.println(update);
		response.sendRedirect(request.getContextPath() + "/StudentController");

	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Updated element: " + id);
		Student student = StudentDbUtil.getStudent(id);

		System.out.println(student);
		request.setAttribute("data", student);
		RequestDispatcher req = request.getRequestDispatcher("updatestudent.jsp");
		req.forward(request, response);

	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		boolean delete = studentDbUtil.deleteStudentDb(id);
		if (delete) {
			response.sendRedirect(request.getContextPath() + "/StudentController");
		}
		System.out.println("Delete element: " + id);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String percentage = request.getParameter("percentage");
		int percentage1 = 0;
		try {
			if (percentage != null && !percentage.isEmpty()) {
				percentage1 = Integer.parseInt(percentage);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Student student = new Student(name, percentage1);
		System.out.println(name);
		boolean add = studentDbUtil.addStudentToDb(student);
		response.sendRedirect(request.getContextPath() + "/StudentController");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
