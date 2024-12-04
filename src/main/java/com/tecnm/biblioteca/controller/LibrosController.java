package com.tecnm.biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.biblioteca.entity.Libro;
import com.tecnm.biblioteca.service.LibrosService;
import com.tecnm.biblioteca.service.ResourceNotFoundException;


@RestController
@RequestMapping("/libros")
public class LibrosController {


    @Autowired
    LibrosService librosService;

    @GetMapping("/")
    public List<Libro> getAll() {
        return librosService.findAll();
    }

    @GetMapping(value = "/id/{id_libro}")
    public Optional<Libro> findById(@PathVariable Integer id_libro) {
        return librosService.findById(id_libro);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Libro> findByNombre(@PathVariable String nombre) {
        return librosService.findByNombre(nombre);
    }

    @PostMapping("/")
    public Libro postMethodName(@RequestBody Libro libro) {        
        return librosService.save(libro);
    }
    
    @DeleteMapping("/{id}")
    public String deleteLibro(@PathVariable Integer id) throws ResourceNotFoundException {
        return librosService.deleteLibro(id);
    }

    @GetMapping("/idioma/{id_idioma}")
    public List<Libro> findByIdioma(@PathVariable Integer id_idioma) {
        return librosService.findByIdioma(id_idioma);
    }

}
