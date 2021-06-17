/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Controller;

import com.unju.tpcardozo.InterfacesService.ILibrosService;
import com.unju.tpcardozo.modelo.Libros;
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
public class LibrosController {
    
    @Autowired
    private ILibrosService service;
    
    @GetMapping("/listarlib")
    public String Listar(Model model){
        List<Libros> libros=service.listar();
        model.addAttribute("libros", libros);
        return "listarlibro";
    }
    
    @GetMapping("/listarIdlib")
    public String listarId(@PathVariable int isbn ,Model model){
        model.addAttribute("libros", service.listarId(isbn));
        return "formlibros";
    }
    
    @GetMapping("/newlib")
    public String agregar(Model model){
        model.addAttribute("libro", new Libros());
        return "formlibros";
    }
    
    @PostMapping("/savelib")
    public String save(@Valid Libros p, Model model){
        service.save(p);
        return "redirect:/listarlib";
    }
    
    @GetMapping("/eliminarlib/{isbn}")
    public String delete (@PathVariable int isbn, Model model){
        service.delete(isbn);
        return "redirect:/listarlib";
    }
    
    @GetMapping("/editarlib/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Libros>libros=service.listarId(id);
        model.addAttribute("libros", libros);
        return "formlibros";
    }
    
}
