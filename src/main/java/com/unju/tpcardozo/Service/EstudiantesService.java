/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Service;

import com.unju.tpcardozo.Interfaces.IEstudiantes;
import com.unju.tpcardozo.InterfacesService.IEstudiantesService;
import com.unju.tpcardozo.modelo.Estudiantes;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Franco
 */
@Service
public class EstudiantesService implements IEstudiantesService{
       
    @Autowired
    private IEstudiantes data;
    
    @Override
    public List<Estudiantes> listar() {
        return (List<Estudiantes>) data.findAll();
    }

    @Override
    public Optional<Estudiantes> listarId(int nroId) {
        return data.findById(nroId);
    }

    @Override
    public int save(Estudiantes p) {
        int res=0;
        Estudiantes Estudiantes = data.save(p);
        if (!Estudiantes.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int nroId) {
        data.deleteById(nroId);
    }
    
}
