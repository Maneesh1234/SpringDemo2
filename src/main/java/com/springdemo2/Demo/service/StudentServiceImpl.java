package com.springdemo2.Demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo2.Demo.entity.Student;
import com.springdemo2.Demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		List<Student> listStudents = studentRepo.findAll();
		return listStudents;
	}

	@Override
	public Student findStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		Student student = studentRepo.findById(studentId).get();
		return student;
	}

	@Override
	public Student updateStudent(Student student, Integer studentID) {
		// TODO Auto-generated method stub
		Student oldStudent = studentRepo.findById(studentID).get();
		//Student newStudent = new Student();
		if(!student.getName().equalsIgnoreCase("") && Objects.nonNull(student.getName()))
			oldStudent.setName(student.getName());
		if(!student.getEmail().equalsIgnoreCase("") && Objects.nonNull(student.getEmail()))
			oldStudent.setEmail(student.getEmail());;
		return studentRepo.save(oldStudent);
	}

	@Override
	public String deleteStudent(Integer studentID) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentID);
		return "student deleted";
	}

}
