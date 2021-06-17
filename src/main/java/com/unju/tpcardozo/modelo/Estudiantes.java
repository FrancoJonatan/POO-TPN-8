/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Franco
 */
@Entity
@Table(name="estudiantes")
public class Estudiantes {
    @Id
    @Column(name="nroId")
    private int nroId;
    
    @Column(name="nombres")
    private String nombres;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column (name="direccion")
    private String direccion;

    public Estudiantes(int nroId, String nombres, String apellido, String direccion) {
        this.nroId = nroId;
        this.nombres = nombres;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Estudiantes() {
    }

    public int getNroId() {
        return nroId;
    }

    public void setNroId(int nroId) {
        this.nroId = nroId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
