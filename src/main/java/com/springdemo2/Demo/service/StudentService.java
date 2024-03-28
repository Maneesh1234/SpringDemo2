package com.springdemo2.Demo.service;

import java.util.List;

import com.springdemo2.Demo.entity.Student;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> findAllStudent();
	Student findStudentById(Integer studentId);
	Student updateStudent(Student student, Integer studentID);
	String deleteStudent(Integer studentID);
	
}
