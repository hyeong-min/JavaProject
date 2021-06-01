package com.java.act7;

class Student {
private String name;
private String department;
private String num;
private double grade;
	public Student(String name, String department, String num, double grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.department = department;
		this.num = num;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getNum() {
		return num;
	}
	public double getGrade() {
		return grade;
	}

	public void find_student(String name) {
		// TODO Auto-generated method stub
		if (name.equals(this.name)) {
			System.out.println(this.name+","+this.department+","+this.num+","+this.grade);
		}

	}
}