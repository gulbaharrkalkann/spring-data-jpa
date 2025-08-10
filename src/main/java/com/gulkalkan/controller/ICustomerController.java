package com.gulkalkan.controller;

import com.gulkalkan.dto.DtoCustomer;

public interface ICustomerController {


    public DtoCustomer findCustomerById(Long id);
}
