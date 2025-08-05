package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoStudent;
import com.gulkalkan.dto.DtoStudentIU;
import com.gulkalkan.entities.Student;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

     public void deleteStudent(Integer id);
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);


}
