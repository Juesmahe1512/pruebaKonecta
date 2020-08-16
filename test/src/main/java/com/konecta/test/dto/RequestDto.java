package com.konecta.test.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RequestDto {
    @NotNull
    private String codigo;
    @NotNull
    private String descripcion;
    @NotNull
    private String resumen;

    @NotNull
    private long number;

    @NotNull
    private long idEmpleado;

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

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
