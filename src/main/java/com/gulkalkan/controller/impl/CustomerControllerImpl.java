package com.gulkalkan.controller.impl;

import com.gulkalkan.controller.ICustomerController;
import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {
@Autowired
    private ICustomerService customerService;


    @GetMapping(path = "/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.findCustomerById(id);
    }
}
