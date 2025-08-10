package com.gulkalkan.services.impl;

import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.entities.Address;
import com.gulkalkan.entities.Customer;
import com.gulkalkan.repository.CustomerRepository;
import com.gulkalkan.services.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public DtoCustomer findCustomerById(Long id) {

        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();
       Optional<Customer> optional = customerRepository.findById(id);
       if (optional.isEmpty()){
           return null;
       }
       Customer customer = optional.get();
       Address address=optional.get().getAddress();

        BeanUtils.copyProperties(customer, dtoCustomer);
        BeanUtils.copyProperties(address, dtoAddress);

        dtoCustomer.setAddress(dtoAddress);

       return dtoCustomer;
    }
}
