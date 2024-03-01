package com.example.customvaliadtion.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator implements ConstraintValidator<ValidateEmployeeType,String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {

        List<String> employeeTypes = Arrays.asList("permanent","vendor");
        return employeeTypes.contains(employeeType);
    }
}

