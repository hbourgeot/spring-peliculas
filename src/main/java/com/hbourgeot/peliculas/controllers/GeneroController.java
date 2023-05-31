package com.hbourgeot.peliculas.controllers;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hbourgeot.peliculas.dao.IGeneroRepository;
import com.hbourgeot.peliculas.entities.Genero;

@RestController
public class GeneroController {
  private IGeneroRepository generoRepository;

  public GeneroController(IGeneroRepository generoRepository) {
    this.generoRepository = generoRepository;
  };
  public Long guardar(@RequestParam String nombre) {
    Genero genero = new Genero();
    genero.setNombre(nombre);

    generoRepository.save(genero);

    return genero.getId();
  }
}
