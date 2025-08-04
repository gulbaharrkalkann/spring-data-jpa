package com.gulkalkan.services.impl;

import com.gulkalkan.entities.Student;
import com.gulkalkan.repository.StudentRepository;
import com.gulkalkan.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
         return studentRepository.save(student);

    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
     List<Student> studentList=   studentRepository.findAll();
        return studentList;

    }

    @Override
    public void deleteStudenta(Integer id) {
      Student dbStudent =  getStudentById(id);
      if (dbStudent != null) {
            studentRepository.delete(dbStudent);
        }
    }

    @Override
    public Student updateStudent(Integer id, Student updatestudent) {
      Student dbStudent=  getStudentById(id);
      if (dbStudent != null) {
          dbStudent.setFirstName(updatestudent.getFirstName());
            dbStudent.setLastName(updatestudent.getLastName());
            dbStudent.setBirtOfDate(updatestudent.getBirtOfDate());
           return studentRepository.save(dbStudent);
      }

        return null;
    }
}
