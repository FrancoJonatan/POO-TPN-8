/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.InterfacesService;

import com.unju.tpcardozo.modelo.Prestamos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Franco
 */
public interface IPrestamosService {
    public List<Prestamos>listar();
    public Optional<Prestamos>listarId(int idPrestamo);
    public int save(Prestamos p);
    public void delete(int idPrestamo);
}
