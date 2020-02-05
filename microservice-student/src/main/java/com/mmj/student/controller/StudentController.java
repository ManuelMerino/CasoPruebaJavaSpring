package com.mmj.student.controller;

import java.util.List;

import com.mmj.student.model.Student;
import com.mmj.student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students/")
	public List<Student> retrieveStudents(@PathVariable String studentId) {
        return studentService.listStudents();
    }
    
	@GetMapping("/students/{studentId}/courses")
	public List<Student> retrieveCoursesForStudent(@PathVariable String studentId) {
        return null;
	}
}