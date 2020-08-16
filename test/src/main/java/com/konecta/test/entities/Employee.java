/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konecta.test.entities;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
/**
 *
 * @author Juan Mazo
 */
@Entity
@Table(name="EMPLOYEE")
public class Employee{
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @JsonFormat(pattern="yyyyMMdd")
    private Date fecha_ingreso;
    @NotNull
    private String nombre;
    @NotNull
    @Min(1)
    private long salario;

    public Employee() {
        
    }


  
        
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
    
}
