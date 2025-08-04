package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.IStudentController;
import com.gulkalkan.entities.Student;
import com.gulkalkan.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping(path ="/save" )
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);    }
}
