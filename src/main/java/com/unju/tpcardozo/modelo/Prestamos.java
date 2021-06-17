/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Franco
 */
@Entity
@Table(name="prestamos")
public class Prestamos{
    
    @Id
    @Column(name="idPrestamo")
    private int idPrestamo;
        
    @ManyToOne
    @JoinColumn(name="nroId")
    private Estudiantes idNro;
    
    @ManyToOne
    @JoinColumn(name="isbn")
    private Libros nroisbn;
    
    @Column(name="fechaPrestamo")
    private String fechaPrestamo;

    public Prestamos() {
    }

    public Prestamos(int idPrestamo, Estudiantes idNro, Libros nroisbn, String fechaPrestamo) {
        this.idPrestamo = idPrestamo;
        this.idNro = idNro;
        this.nroisbn = nroisbn;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Estudiantes getIdNro() {
        return idNro;
    }

    public void setIdNro(Estudiantes idNro) {
        this.idNro = idNro;
    }

    public Libros getNroisbn() {
        return nroisbn;
    }

    public void setNroisbn(Libros nroisbn) {
        this.nroisbn = nroisbn;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    
    
    
}
