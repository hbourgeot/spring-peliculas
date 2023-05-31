package com.hbourgeot.peliculas.services;

import com.hbourgeot.peliculas.entities.Genero;

import java.util.List;

public interface IGeneroService {
  public void save(Genero genero);
  public Genero findById(Long id);
  public void delete(Long id);

  public List<Genero> findAll();
}
