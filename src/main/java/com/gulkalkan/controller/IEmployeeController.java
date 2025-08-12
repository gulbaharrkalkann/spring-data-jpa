package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
