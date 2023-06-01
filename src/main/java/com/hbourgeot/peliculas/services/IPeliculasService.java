package com.hbourgeot.peliculas.services;

import com.hbourgeot.peliculas.entities.Peliculas;

import java.util.List;

public interface IPeliculasService {

     void save (Peliculas pelicula);

    public Peliculas findById(Long id);

    public List<Peliculas> findAll();

    public void delete(Long id);
}
