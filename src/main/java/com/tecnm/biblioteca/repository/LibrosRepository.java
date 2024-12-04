package com.tecnm.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnm.biblioteca.entity.Libro;


public interface LibrosRepository extends JpaRepository<Libro, Integer>{
    List<Libro> findByNombre(String nombre);
    public List<Libro> findByIdiomaId(Integer idIdioma);


}
