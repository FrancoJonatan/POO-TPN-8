/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.InterfacesService;

import com.unju.tpcardozo.modelo.Libros;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Franco
 */
public interface ILibrosService {
    public List<Libros>listar();
    public Optional<Libros>listarId(int isbn);
    public int save(Libros p);
    public void delete(int isbn);
}
