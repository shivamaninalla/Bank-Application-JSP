package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import com.model.entity.Student;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student(1,"shivamani","nalla","shiva@abc"));
		students.add(new Student(2,"saikiran","nalla","sai@abc"));
		students.add(new Student(3,"cherry","nalla","cherry@abc"));
		return students;
	}

}
