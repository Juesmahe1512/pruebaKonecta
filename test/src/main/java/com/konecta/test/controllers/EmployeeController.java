/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.controllers;

import com.konecta.test.entities.Employee;
import com.konecta.test.services.EmployeeService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Mazo
 */

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping(value = "")
    public List<Employee> list(){
       return employeeService.list();
    }
    
    @GetMapping(value = "/{id}")
    public Employee getOne(@PathVariable long id){
       return employeeService.getEmployee(id);
    }
    
    @PutMapping(value = "")
    public void insertEmployee(@Valid @RequestBody Employee input){
        employeeService.putEmployee(input);
    }


}
