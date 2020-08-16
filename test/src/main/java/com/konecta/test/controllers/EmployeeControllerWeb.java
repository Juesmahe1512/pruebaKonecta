/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.controllers;

import com.konecta.test.entities.Employee;
import com.konecta.test.entities.Request;
import com.konecta.test.services.EmployeeService;
import java.util.List;

import com.konecta.test.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Juan Mazo
 */
@Controller
public class EmployeeControllerWeb {
    
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RequestService requestService;
    
    
    @RequestMapping("/proyect")
    public String employee(Model modelo){
        
        return "proyect";
        
        
    }


    @RequestMapping("/cargarempleados")
    public String cargarEmpleado(Model modelo){
        List<Employee> listado=employeeService.list();
        modelo.addAttribute("listaEmpleados",listado);
        return "cargarEmpleado";
    }

    @RequestMapping("/crearEmpleado")
    public String crearEmpleado(Model modelo){
        return "crearEmpleado";
    }

    @RequestMapping("/crearsolicitudes")
    public String crearsolicitud(Model modelo){
        return "crearsolicitudes";
    }

    @RequestMapping("/cargarSolicitudes")
    public String listarSolicitudes(Model modelo){
        List<Request> listado=requestService.list();
        modelo.addAttribute("listaSolicitudes",listado);
        return "cargarSolicitudes";
    }
    
    
}
