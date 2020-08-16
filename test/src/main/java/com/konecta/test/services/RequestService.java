/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.services;

import com.konecta.test.dto.RequestDto;
import com.konecta.test.entities.Employee;
import com.konecta.test.entities.Request;
import com.konecta.test.repository.RequestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Mazo
 */
@Service
public class RequestService {
    
    @Autowired
    private RequestRepository requesRepository;

    @Autowired
    private EmployeeService employeeService;
    
    public List<Request> list() {
        return requesRepository.findAll();
    }
    
    public Request getRequest(long id){
        try{
        return requesRepository.findById(id).get();
        }catch(Exception e)
        {
            return null;
        }
    }
    
    public void putRequest(RequestDto input){
        Employee employee=employeeService.getEmployee(input.getIdEmpleado());
        Request request=new Request();
        request.setNumber(input.getNumber());
        request.setCodigo(input.getCodigo());
        request.setDescripcion(input.getDescripcion());
        request.setResumen(input.getResumen());
        request.setEmpleado(employee);
        requesRepository.save(request);
    }
        
}
