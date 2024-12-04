package com.tecnm.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity(name="idioma")
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idioma_id")
    private int id;
        
    @Column
    private String idioma;
    
    

}
