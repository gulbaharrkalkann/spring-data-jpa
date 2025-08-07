package com.gulkalkan.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
    @NotEmpty(message = "First name cannot be empty")

    @Size(min = 2, max = 20, message = "First name must be between 2 and 20 characters")
    private String firstName;

   @Size(min = 2, max = 30)
    private String lastName;

    private Date birtOfDate;

    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 11, max = 11,message = "TCKN must be 11 characters long")
    @NotEmpty(message = "TCKN cannot be empty")
    private String tckn;


}