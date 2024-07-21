package com.monocept.model;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	private boolean manager;
	public Employee(String name, int id, double salary, boolean manager) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.manager = manager;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean getManager() {
		return manager;
	}
	public void setManager(boolean isManager) {
		this.manager = manager;
	}
	

}
