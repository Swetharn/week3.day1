package org.student;

import org.department.Department;

/*Multilevel inheritance*/
public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name::  Swetha Rajendran");
	}

	public void studentDept() {
		System.out.println("The Student belongs to ECE department");
	}

	public void studentId() {
		System.out.println("Student id No:: 'A32532'");
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	}
}
