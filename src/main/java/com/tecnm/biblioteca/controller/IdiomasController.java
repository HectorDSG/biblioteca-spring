package com.tecnm.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.biblioteca.entity.Idioma;
import com.tecnm.biblioteca.service.IdiomasService;



@RestController
@RequestMapping("/idiomas")
public class IdiomasController {


    @Autowired
    IdiomasService idiomasService;

    @GetMapping("/")
    public List<Idioma> getAll() {
        return idiomasService.findAll();
    }

    @GetMapping(value = "/id/{id_idioma}")
    public Optional<Idioma> findById(@PathVariable Integer id_idioma) {
        return idiomasService.findById(id_idioma);
    }
    
    @PostMapping("/")
    public Idioma postMethodName(@RequestBody Idioma idioma) {        
        return idiomasService.save(idioma);
    }


    

}
