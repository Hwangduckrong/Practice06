package com.javaex.ex05;

public class Depart extends Employee {

	//필드
	private String Department;
	
	//생성자
	public Depart() {
		super();
	}

	public Depart(String name, int salary, String Department) {
		super(name, salary);
		this.Department=Department;
	}
	//메소드gs
	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	public void showInformation() {
		System.out.println("이름:"+super.getName()+"연봉: "+super.getSalary()+" "+Department);
	}
	
	
}
	

	//메소드 일반