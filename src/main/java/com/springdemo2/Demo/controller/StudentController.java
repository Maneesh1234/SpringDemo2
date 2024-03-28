package com.springdemo2.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo2.Demo.entity.Student;
import com.springdemo2.Demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<Student> findAllStudent(){
		return studentService.findAllStudent();
	}
	
	@GetMapping("/{studentId}")
	public Student findStudentById(@PathVariable("studentId") Integer studentId){
		return studentService.findStudentById(studentId);
	}
	
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student student ){
		return studentService.saveStudent(student);
	}
	
	@DeleteMapping("/{studentId}")
	public String deleteStudent(@PathVariable("studentId") Integer studentId) {
		return studentService.deleteStudent(studentId);
	}
	@PutMapping("/{studentId}")
	public Student updateStudent(@RequestBody Student student,@PathVariable("studentId") Integer studentId) {
		return studentService.updateStudent(student, studentId);
	}
	
}
