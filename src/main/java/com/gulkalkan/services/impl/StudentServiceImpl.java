package com.gulkalkan.services.impl;

import com.gulkalkan.entities.Student;
import com.gulkalkan.repository.StudentRepository;
import com.gulkalkan.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
         return studentRepository.save(student);

    }
}
