package com.example.customvaliadtion.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class)

public @interface ValidateEmployeeType {
    public String message()default "Invalid employeeType: It should be either permanent or either vendor";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
