package com.example.customvaliadtion.service;

import com.example.customvaliadtion.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class EmployeeService {

    public Employee addNewEmployee(Employee employee){

        employee.setEmpId(new Random().nextInt(68736432)); //used to generate the random integer from 0 to 68736432
        return employee;
    }
}
