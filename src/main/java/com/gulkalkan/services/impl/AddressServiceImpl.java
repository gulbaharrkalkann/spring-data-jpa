package com.gulkalkan.services.impl;

import com.gulkalkan.dto.DtoAddress;
import com.gulkalkan.dto.DtoCustomer;
import com.gulkalkan.entities.Address;
import com.gulkalkan.repository.AddressRepository;
import com.gulkalkan.services.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AddressServiceImpl implements IAddressService {


    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id) {
        DtoAddress dtoAddress = new DtoAddress();


      Optional<Address> optional=  addressRepository.findById(id);
      if (optional.isEmpty()){
          return null;
      }
      Address address = optional.get();
      BeanUtils.copyProperties(address, dtoAddress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
       // dtoCustomer.setAddress(dtoAddress);
        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;
    }
}