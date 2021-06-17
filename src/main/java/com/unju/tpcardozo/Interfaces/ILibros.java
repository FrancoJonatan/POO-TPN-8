/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Interfaces;

import com.unju.tpcardozo.modelo.Libros;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Franco
 */
public interface ILibros extends CrudRepository<Libros, Integer>{
    
}
