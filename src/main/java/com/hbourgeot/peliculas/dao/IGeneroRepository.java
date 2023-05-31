package com.hbourgeot.peliculas.dao;

import com.hbourgeot.peliculas.entities.Genero;

public interface IGeneroRepository {
  public void save(Genero genero);

  public Genero findById(Long id);
}
