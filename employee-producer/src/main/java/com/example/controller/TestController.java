package com.example.controller;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstPage(){
        Employee employee = new Employee();
        employee.setName("emp1");
        employee.setDescription("manager");
        employee.setEmpId("1");
        employee.setSalary(3000);
        return employee;
    }
}
