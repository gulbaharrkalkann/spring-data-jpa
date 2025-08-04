package com.gulkalkan.controller;

import com.gulkalkan.entities.Student;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentController {

    public Student saveStudent( Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

     public void deleteStudent(Integer id);
    public Student updateStudent(Integer id, Student updateStudent);


}
