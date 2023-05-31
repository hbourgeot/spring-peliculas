package com.hbourgeot.peliculas.controllers;

import com.hbourgeot.peliculas.services.IGeneroService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hbourgeot.peliculas.entities.Genero;

@RestController
public class GeneroController {

  private IGeneroService service;

  public GeneroController(IGeneroService service1){
    this.service = service1;
  }

  @PostMapping("/genero")
  public Long guardar(@RequestParam String nombre){
    Genero genero  = new Genero();
    genero.setNombre(nombre);

    service.save(genero);

    return genero.getId();
  }

  @GetMapping("/genero/{id}")
  public String buscarPorId(@PathVariable Long id){
    return service.findById(id).getNombre();
  }
}
