/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.repository;


import com.konecta.test.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Juan Mazo
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
