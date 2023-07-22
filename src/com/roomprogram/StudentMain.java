package com.roomprogram;

interface Student {
	String displayDetails();
}
class College {
	private String name;
	private Student student;

	public College(String name, Student student) {
		this.name = name;
		this.student = student;
	}
	public String displayDetails() {
		return "College Name:" + name + student.displayDetails();
	}
}
class Boys implements Student {
	private String name;
	private int id;

	public Boys(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public String displayDetails() {
		return "Student Name:" + name + "Student ID:" + id;
	}
}
public class StudentMain {
	public static void main(String[] args) {
		Student st = new Boys("Sufiyan\n", 10);
		College clg = new College("ARC PG COLLEGE\n", st);
		System.out.println(clg.displayDetails());
	}
}
