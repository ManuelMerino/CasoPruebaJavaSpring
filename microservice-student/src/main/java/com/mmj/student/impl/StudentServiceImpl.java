package com.mmj.student.impl;

import java.util.List;

import com.mmj.student.model.Student;
import com.mmj.student.repository.StudentRepository;
import com.mmj.student.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> listStudents() {
        return repository.findAll();
    }
    
}