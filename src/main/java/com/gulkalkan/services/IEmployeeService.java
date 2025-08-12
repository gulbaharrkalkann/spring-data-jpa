package com.gulkalkan.services;

import com.gulkalkan.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();
}
