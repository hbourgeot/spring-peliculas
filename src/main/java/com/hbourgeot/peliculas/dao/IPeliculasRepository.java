package com.hbourgeot.peliculas.dao;

import com.hbourgeot.peliculas.entities.Peliculas;
import org.springframework.data.repository.CrudRepository;

public interface IPeliculasRepository extends CrudRepository<Peliculas, Long> {
}
