package com.example.customvaliadtion.dto;

import com.example.customvaliadtion.validation.ValidateEmployeeType;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int empId;
   @NotBlank(message = "firstname should not be null or empty")
    private String firstName;
   @NotBlank(message = "lastname should not be null or empty")
    private String lastName;
   @Past(message = "The event date must be in the past")
    private Date doj;
   @NotNull(message = "department should not be null")
   @NotEmpty(message = "department should not be empty")
    private String dept;
   @Email(message = "invalid email id")
    private String email;

   //custom annotation
   @ValidateEmployeeType
    private String employeeType;  //permanent,vendor,contractual


}
