package com.hbourgeot.peliculas.controllers;

import com.hbourgeot.peliculas.entities.Peliculas;
import com.hbourgeot.peliculas.services.GeneroService;
import com.hbourgeot.peliculas.services.IGeneroService;
import com.hbourgeot.peliculas.services.IPeliculasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PeliculasController {
    private IPeliculasService service;
    private IGeneroService generoService;

    public PeliculasController(IPeliculasService serv, IGeneroService gene){
        this.service = serv;
        this.generoService = gene;
    }

    @GetMapping("/pelicula")
    public String crear(Model model){
        Peliculas pelicula = new Peliculas();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("titulo", "Crear pelicula");
        model.addAttribute("generos", generoService.findAll());
        return "pelicula";
    }

    @GetMapping("/pelicula/{id}")
    public String editar(@PathVariable Long id, Model model){
        Peliculas pelicula = new Peliculas();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("titulo", "Editar pelicula");
        model.addAttribute("generos", generoService.findAll());
        return "pelicula";
    }

    @PostMapping("/pelicula")
    public String guardar(Peliculas pelicula){
        service.save(pelicula);
        return "redirect:home";
    }

    @GetMapping(value = {"/home", "/", "index"})
    public String home(){
        return "home";
    }
}
