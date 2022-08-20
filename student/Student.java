package org.student;

import org.department.Department;

public class Student extends Department {
public void studentName() {
	System.out.println("Student Name: Divya");}
public void studentdept() {
	System.out.println("Student Dept : Commerce");}
public void studentId() {
	System.out.println("Student ID : 12234");}
	
	public static void main(String[] args) {
		Student Object = new Student();
		Object.collegeCode();
		Object.collegeName();
		Object.collegeRank();
		Object.deptName();
		Object.studentName();
		Object.studentdept();
		Object.studentId();
		
		
		
				
	}
}

