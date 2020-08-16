/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.controllers;

import com.konecta.test.dto.RequestDto;
import com.konecta.test.entities.Request;
import com.konecta.test.services.RequestService;
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
@RequestMapping(value = "/api/request")
public class RequestController {
    
    @Autowired
    private RequestService requestService;
    
   @GetMapping(value = "")
    public List<Request> list(){
       return requestService.list();
    }
    
    @GetMapping(value = "/{id}")
    public Request getOne(@PathVariable long id){
       return requestService.getRequest(id);
    }
    
    @PutMapping(value = "")
    public void insertEmployee(@Valid @RequestBody RequestDto input){
        requestService.putRequest(input);
    }
    
    
}
