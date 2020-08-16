/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Juan Mazo
 */
@Entity
@Table(name="REQUEST")
public class Request {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    private String codigo;
    @NotNull
    private String descripcion;
    @NotNull
    private String resumen;
    @NotNull
    @Min(1)
    private long number;
    @ManyToOne
    @JoinColumn(name="id_empleado", nullable=false)
    private Employee empleado;

    
    public Request() {
    }
    


    public Employee getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Employee empleado) {
        this.empleado = empleado;
    }

   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    
}
