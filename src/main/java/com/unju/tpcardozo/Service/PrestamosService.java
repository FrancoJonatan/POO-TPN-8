/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Service;

import com.unju.tpcardozo.Interfaces.IPrestamos;
import com.unju.tpcardozo.InterfacesService.IPrestamosService;
import com.unju.tpcardozo.modelo.Prestamos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Franco
 */
@Service
public class PrestamosService implements IPrestamosService{
    
    @Autowired
    private IPrestamos data;

    @Override
    public List<Prestamos> listar() {
        return (List<Prestamos>) data.findAll();
    }

    @Override
    public Optional<Prestamos> listarId(int idPrestamo) {
        return data.findById(idPrestamo);
    }

    @Override
    public int save(Prestamos p) {
        int res=0;
        Prestamos Prestamos = data.save(p);
        if (!Prestamos.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int idPrestamo) {
        data.findById(idPrestamo);
    }
    
    
    
}
