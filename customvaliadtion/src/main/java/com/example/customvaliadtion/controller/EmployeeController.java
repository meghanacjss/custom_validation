package com.example.customvaliadtion.controller;

import com.example.customvaliadtion.dto.Employee;
import com.example.customvaliadtion.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/")
    public Employee addNewEmployeeToSystem(@RequestBody @Valid Employee employee){
        return service.addNewEmployee(employee);
    }
}
