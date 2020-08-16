/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.services;

import com.konecta.test.entities.Employee;
import com.konecta.test.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Mazo
 */
@Service
public class EmployeeService {
    
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    
    public List<Employee> list(){
        return employeeRepository.findAll();
    }
    
    public Employee getEmployee(long id)
    { 
      try{
        return employeeRepository.findById(id).get();
         }catch(Exception e)
        {
            return null;
        }
    }
    
    public void putEmployee(Employee input)
    {
        employeeRepository.save(input);
    }
}
