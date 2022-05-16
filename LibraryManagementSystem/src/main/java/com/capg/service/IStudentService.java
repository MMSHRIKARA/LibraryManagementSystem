package com.capg.service;

import java.util.List;

import com.capg.exception.StudentNotFoundException;
import com.capg.models.Student;

public interface IStudentService {
	
    Student createStudent(Student student);
	
	Student updateStudent(Student student)throws StudentNotFoundException;
	
	void removeStudent(int studentId)throws StudentNotFoundException;
	
	Student viewStudentById(int  studentId) throws StudentNotFoundException;
	
	List<Student> viewAllStudent();
	
//	Student viewStudentBylastName(String lastName) throws StudentNotFoundException;
//	
//	boolean validateStudent(String userName, String password);
	

}
