package com.tecnm.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="editorial")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "editorial_id")
    private int id;
        
    @Column
    private String nombre;

    @Column
    private String direccion;

    @Column
    private String telefono;
    

}
