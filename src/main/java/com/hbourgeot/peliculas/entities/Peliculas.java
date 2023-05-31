package com.hbourgeot.peliculas.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "peliculas")
public class Peliculas implements Serializable {
  private static final long serialVersionUID = -4509451998659894417L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;

  @Column(name = "fecha_estreno")
  @Temporal(TemporalType.DATE)
  private Date fechaEstreno;
  private Genero genero;
  private List<Actor> protagonistas;

  public void setId(Long id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setProtagonistas(List<Actor> protagonistas) {
        this.protagonistas = protagonistas;
    }

  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Actor> getProtagonistas() {
        return protagonistas;
    }



}
