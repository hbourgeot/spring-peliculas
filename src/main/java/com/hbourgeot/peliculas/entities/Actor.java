package com.hbourgeot.peliculas.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actores")
public class Actor implements Serializable {
  private static final long serialVersionUID = -4509451998659894417L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;

  @Column(name = "url_imagen")
  private String urlImagen;

  public Long getld() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUr1Imagen() {
    return this.urlImagen;
  }

  public void setUrI1magen(String urlImagen) {
    this.urlImagen = urlImagen;
  }
}
