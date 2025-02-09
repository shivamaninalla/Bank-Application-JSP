package com.model.entity;

public class Student {
	
	private String name;
	private int percentage;
	private int id;
	public Student(String name, int percentage, int id) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.id = id;
	}
	public Student(String name2, int percentage1) {
		this.name=name2;
		this.percentage=percentage1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", percentage=" + percentage + ", id=" + id + "]";
	}
	
	
}
