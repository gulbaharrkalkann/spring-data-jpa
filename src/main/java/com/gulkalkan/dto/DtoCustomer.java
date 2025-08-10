package com.gulkalkan.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gulkalkan.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)//Bu method null değerleri içermeyecek şekilde ayarlar
public class DtoCustomer {

    private Long id;
    private String name;

    private DtoAddress address;
}
