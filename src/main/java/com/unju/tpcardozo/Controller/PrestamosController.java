/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Controller;

import com.unju.tpcardozo.InterfacesService.IEstudiantesService;
import com.unju.tpcardozo.InterfacesService.ILibrosService;
import com.unju.tpcardozo.InterfacesService.IPrestamosService;
import com.unju.tpcardozo.modelo.Estudiantes;
import com.unju.tpcardozo.modelo.Libros;
import com.unju.tpcardozo.modelo.Prestamos;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Franco
 */
@Controller
@RequestMapping
public class PrestamosController {
    
    @Autowired
    private IPrestamosService service_pres;
    
    @Autowired
    private IEstudiantesService service_estud;
    
    @Autowired
    private ILibrosService service_lib;
    
    @GetMapping("/listarpres")
    public String Listar(Model model){
        List<Prestamos> prestamos=service_pres.listar();
        model.addAttribute("prestamos", prestamos);
        return "listarprestamos";
    }
    
    @GetMapping("/listarIdpres")
    public String listarId(@PathVariable int idPrestamo ,Model model){
        model.addAttribute("prestamos", service_pres.listarId(idPrestamo));
        List<Estudiantes> estudiantes=service_estud.listar();
        model.addAttribute("estudiantes", estudiantes);
        List<Libros> libros=service_lib.listar();
        model.addAttribute("libros", libros);
        return "formprestamos";
    }
    
    @GetMapping("/newpres")
    public String agregar(Model model){
        model.addAttribute("prestamos", new Prestamos());
        List<Estudiantes> estudiantes=service_estud.listar();
        model.addAttribute("estudiantes", estudiantes);
        List<Libros> libros=service_lib.listar();
        model.addAttribute("libros", libros);
        return "formprestamos";
    }
    
    @PostMapping("/savepres")
    public String save(@Valid Prestamos p, Model model){
        service_pres.save(p);
        return "redirect:/listarpres";
    }
    
    @GetMapping("/eliminarpres/{idPrestamo}")
    public String delete (@PathVariable int idPrestamo, Model model){
        service_pres.delete(idPrestamo);
        return "redirect:/listarpres";
    }
    
    @GetMapping("/editarpres/{idPrestamo}")
    public String editar(@PathVariable int idPrestamo, Model model){
        Optional<Prestamos>prestamos=service_pres.listarId(idPrestamo);
        model.addAttribute("prestamo", prestamos);
        List<Estudiantes> estudiantes=service_estud.listar();
        model.addAttribute("estudiantes", estudiantes);
        List<Libros> libros=service_lib.listar();
        model.addAttribute("libros", libros);
        System.out.println(estudiantes.toString());
        System.out.println(libros.toString());
        return "formprestamos";
    }
    
}
