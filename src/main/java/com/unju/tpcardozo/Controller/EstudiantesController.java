/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.tpcardozo.Controller;

import com.unju.tpcardozo.InterfacesService.IEstudiantesService;
import com.unju.tpcardozo.modelo.Estudiantes;
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
public class EstudiantesController {
    
    @Autowired
    private IEstudiantesService service;
    
    @GetMapping("/index")
    public String page(Model model) {
        model.addAttribute("addAtribute", "value");
        return "index";
    }
    
    @GetMapping("/listarestud")
    public String Listar(Model model){
        List<Estudiantes> estudiantes=service.listar();
        model.addAttribute("estudiantes", estudiantes);
        return "listarestudiantes";
    }
    
    @GetMapping("/listarIdestud/{nroId}")
    public String listarId(@PathVariable int nroId ,Model model){
        model.addAttribute("estudiantes", service.listarId(nroId));
        return "formestudiantes";
    }
    
    
    @GetMapping("/newestud")
    public String agregar(Model model){
        model.addAttribute("estudiantes", new Estudiantes());
        return "formestudiantes";
    }
    
     @PostMapping("/saveestud")
    public String save(@Valid Estudiantes p, Model model){
        service.save(p);
        return "redirect:/listarestud";
    }
    
    @GetMapping("/eliminarestud/{nroId}")
    public String delete (@PathVariable int nroId, Model model){
        service.delete(nroId);
        return "redirect:/listarestud";
    }
    
    @GetMapping("/editarestud/{nroId}")
    public String editar(@PathVariable int nroId, Model model){
        Optional<Estudiantes>Estudiantes=service.listarId(nroId);
        model.addAttribute("estudiantes", Estudiantes);
        return "formestudiantes";
    }
}
