package com.hbourgeot.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.hbourgeot.peliculas.entities.Genero;

import java.util.Optional;

public interface IGeneroRepository extends CrudRepository<Genero, Long> {

    @Override
    <S extends Genero> S save(S entity);

    @Override
    <S extends Genero> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    Optional<Genero> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<Genero> findAll();

    @Override
    Iterable<Genero> findAllById(Iterable<Long> longs);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Genero entity);

    @Override
    void deleteAllById(Iterable<? extends Long> longs);

    @Override
    void deleteAll(Iterable<? extends Genero> entities);

    @Override
    void deleteAll();
}
