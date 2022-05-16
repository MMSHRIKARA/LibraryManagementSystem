package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.exception.StudentNotFoundException;
import com.capg.models.Student;
import com.capg.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceImpl studentService;
	
	@PostMapping("/createStudent")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		Student stu = studentService.createStudent(student);
		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) throws StudentNotFoundException{
		
		return studentService.updateStudent(student);
	
	}
	
	@DeleteMapping("/deleteStudent/{StudentId}")
	public void removeStudent(@PathVariable("StudentId") int  studentId) throws StudentNotFoundException {
		studentService.removeStudent( studentId);
	}

	@GetMapping("/viewStudentById/{StudentId}")
	public ResponseEntity<Student>  getStudent(@PathVariable("StudentId") int  studentId) throws StudentNotFoundException
	{
		Student stu = studentService.viewStudentById(studentId);
	    return new  ResponseEntity<Student>(stu, HttpStatus.OK) ;
	}
	
	
	@GetMapping("/allStudent")
	public List<Student> getAllStudent() 
	{
	return studentService.viewAllStudent();
	}

	

	

}
