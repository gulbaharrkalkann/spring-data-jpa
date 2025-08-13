package com.gulkalkan.services.impl;

import com.gulkalkan.dto.DtoCourse;
import com.gulkalkan.dto.DtoStudent;
import com.gulkalkan.dto.DtoStudentIU;
import com.gulkalkan.entities.Course;
import com.gulkalkan.entities.Student;
import com.gulkalkan.repository.StudentRepository;
import com.gulkalkan.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public DtoStudent saveStudent(DtoStudentIU dtostudentIU) {
        DtoStudent response =new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtostudentIU, student);
       Student dbStudent= studentRepository.save(student);
       BeanUtils.copyProperties(dbStudent,response);
       return response;


    }

    @Override
    public DtoStudent getStudentById(Integer id) {

        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional=studentRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        Student dbStudent =optional.get();
        BeanUtils.copyProperties(dbStudent, dtoStudent);

        if (dbStudent.getCourses()!=null&&!dbStudent.getCourses().isEmpty()){
            for (Course course : dbStudent.getCourses()){
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course, dtoCourse);

                dtoStudent.getCourses().add(dtoCourse);
            }
        }

        return dtoStudent;
    }





    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtoList=new ArrayList<>();
     List<Student> studentList=   studentRepository.findAllStudents();
     for (Student student : studentList) {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
     }
        return dtoList;

    }

    @Override
    public void deleteStudenta(Integer id) {
     // DtoStudent dbStudent =  getStudentById(id);
      Optional<Student> optional=  studentRepository.findById(id);
      if (optional.isPresent()) {
            studentRepository.delete(optional.get());
        }
    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtostudentIU) {
      DtoStudent dto =new DtoStudent();
       Optional<Student> optional= studentRepository.findById(id);
       if (optional.isPresent()) {
           Student dbStudent = optional.get();
           dbStudent.setFirstName(dtostudentIU.getFirstName());
              dbStudent.setLastName(dtostudentIU.getLastName());
            Student updatedStudent=  studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent, dto);
            return dto;
       }
       return null;
    }

}
