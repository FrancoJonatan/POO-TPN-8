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
@Table(name="libros")
public class Libros {
    
    @Id
    @Column(name="isbn")
    private int isbn;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="editorial")
    private String editorial;
    
    @Column(name="autor")
    private String autor;

    public Libros(int isbn, String titulo, String editorial, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
    }

    public Libros() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
}
