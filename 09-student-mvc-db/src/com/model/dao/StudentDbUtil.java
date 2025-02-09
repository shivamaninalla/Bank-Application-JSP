package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.model.entity.Student;

public class StudentDbUtil {

	private static DataSource dataSource;

	public StudentDbUtil(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public List<Student> getStudents() throws SQLException {

		List<Student> students = new ArrayList<>();
		Connection conn = dataSource.getConnection();
		Statement st = conn.createStatement();
		String query = "select * from student";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {

			String name = rs.getString("name");
			int percentage = rs.getInt("percentage");
			int id = rs.getInt("id");

			Student student = new Student(name, percentage, id);
			students.add(student);

		}
		return students;

	}

	public boolean addStudentToDb(Student student) {

		try {
			Connection conn = dataSource.getConnection();
			String query = "insert into student(name,percentage) values(?,?)";
			PreparedStatement p = conn.prepareStatement(query);
			p.setString(1, student.getName());
			p.setInt(2, student.getPercentage());

			int rs = p.executeUpdate();
			return rs == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public static Student getStudent(int id) {
		try {
			Connection conn = dataSource.getConnection();
			String query = "select * from student where id=?";
			PreparedStatement p = conn.prepareStatement(query);

			p.setInt(1, id);

			ResultSet rs = p.executeQuery();
			while (rs.next()) {

				String name = rs.getString("name");
				int percentage = rs.getInt("percentage");
				int idn = rs.getInt("id");

				Student student = new Student(name, percentage, idn);

				return student;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public boolean updateStudentToDb(Student student1) {
		try {
			Connection conn = dataSource.getConnection();
			String query = "update student set name=? ,percentage=? where id=?";
			PreparedStatement p = conn.prepareStatement(query);
			p.setString(1, student1.getName());
			p.setInt(2, student1.getPercentage());
			p.setInt(3, student1.getId());
			

			int rs = p.executeUpdate();
			return rs == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		
	}

	public boolean deleteStudentDb(int id) {
		try {
			Connection conn = dataSource.getConnection();
			String query = "delete from student where id=?";
			PreparedStatement p = conn.prepareStatement(query);

			p.setInt(1, id);
			

			int rs = p.executeUpdate();
			return rs == 1 ? true : false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public static List<Student> searchStudentDb(int id1) {
		try {
			List<Student> students = new ArrayList<>();
			Connection conn = dataSource.getConnection();
			String query = "select * from student where id=?";
			PreparedStatement p = conn.prepareStatement(query);

			p.setInt(1, id1);

			ResultSet rs = p.executeQuery();
			while (rs.next()) {

				String name = rs.getString("name");
				int percentage = rs.getInt("percentage");
				int idn = rs.getInt("id");

				Student student =  new Student(name, percentage, idn);
students.add(student);
				return students;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
