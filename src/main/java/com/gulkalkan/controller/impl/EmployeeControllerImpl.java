package com.gulkalkan.controller.impl;


import com.gulkalkan.controller.IEmployeeController;
import com.gulkalkan.dto.DtoEmployee;
import com.gulkalkan.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    @GetMapping(path = "/list")
    @Override
    public List<DtoEmployee> findAllEmployees() {

        return employeeService.findAllEmployees();
    }
}
