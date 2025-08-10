package com.gulkalkan.services;

import com.gulkalkan.dto.DtoCustomer;

public interface ICustomerService {
    public DtoCustomer findCustomerById(Long id);

}
