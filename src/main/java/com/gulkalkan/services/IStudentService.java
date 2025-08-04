package com.gulkalkan.services;

import com.gulkalkan.entities.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);
    public void deleteStudenta(Integer id);

    public Student updateStudent(Integer id, Student updatestudent);

}
