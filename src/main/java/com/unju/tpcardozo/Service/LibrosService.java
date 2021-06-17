/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Service;

import com.unju.tpcardozo.Interfaces.ILibros;
import com.unju.tpcardozo.InterfacesService.ILibrosService;
import com.unju.tpcardozo.modelo.Libros;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Franco
 */
@Service
public class LibrosService implements ILibrosService {
    
    @Autowired
    private ILibros data;

    @Override
    public List<Libros> listar() {
        return (List<Libros>) data.findAll();
    }

    @Override
    public Optional<Libros> listarId(int isbn) {
        return data.findById(isbn);
    }

    @Override
    public int save(Libros p) {
        int res=0;
        Libros Libros = data.save(p);
        if (!Libros.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int isbn) {
        data.deleteById(isbn);
    }
    
    
    
}
