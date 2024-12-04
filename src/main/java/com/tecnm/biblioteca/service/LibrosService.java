package com.tecnm.biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnm.biblioteca.entity.Libro;
import com.tecnm.biblioteca.repository.LibrosRepository;

@Service
public class LibrosService {

    @Autowired
    LibrosRepository librosRepository;
    
    public List<Libro> findAll(){
        return librosRepository.findAll();
    }

    /**
     * @param id_libro
     * @return
     */
    public Optional<Libro> findById(int id_libro){
        return librosRepository.findById(id_libro);
    }

    public List<Libro> findByNombre(String nombre) {
        return librosRepository.findByNombre(nombre);
    }
    
    
    public Libro save(Libro m){
        return librosRepository.save(m);
    }

    public String deleteLibro(Integer id) throws ResourceNotFoundException {
        if (librosRepository.existsById(id)) {
            librosRepository.deleteById(id);
            return "Libro eliminado con éxito";
        } else {
            throw new ResourceNotFoundException("Libro no encontrado");
        }
    }

    public List<Libro> findByIdioma(Integer idIdioma) {
        return librosRepository.findByIdiomaId(idIdioma);
    }
    
    
}
