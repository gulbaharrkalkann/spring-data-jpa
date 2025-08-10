package com.gulkalkan.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DtoAddress {

    private long id;

    private String description;

    private DtoAddress address;

    private DtoCustomer customer;
}
