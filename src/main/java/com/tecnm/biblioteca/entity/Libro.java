package com.tecnm.biblioteca.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "libro_id")
    private int id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @ManyToOne
    private Idioma idioma;

    @ManyToOne
    private Editorial editorial;

    @Column
    private LocalDate fechaPublicacion;

    @Column
    private int paginas;

    @Column
    private boolean pastaDura;

}
