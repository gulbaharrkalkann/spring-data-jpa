package com.gulkalkan.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {

    private Integer id;
    private String firstName;

    private String lastName;

    private List <DtoCourse> courses =new ArrayList<>();

}
