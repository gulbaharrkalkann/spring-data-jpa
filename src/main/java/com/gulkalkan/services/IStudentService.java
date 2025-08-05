package com.gulkalkan.services;

import com.gulkalkan.dto.DtoStudent;
import com.gulkalkan.dto.DtoStudentIU;
import com.gulkalkan.entities.Student;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);
    public void deleteStudenta(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);


}
