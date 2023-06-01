package com.hbourgeot.peliculas.services;

import com.hbourgeot.peliculas.dao.IPeliculasRepository;
import com.hbourgeot.peliculas.entities.Peliculas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculasService implements IPeliculasService{

    @Autowired
    private IPeliculasRepository repo;
    @Override
    public void save(Peliculas pelicula) {
        repo.save(pelicula);
    }

    @Override
    public Peliculas findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Peliculas> findAll() {
        return (List<Peliculas>) repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
