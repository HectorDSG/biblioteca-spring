package com.tecnm.biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnm.biblioteca.entity.Idioma;
import com.tecnm.biblioteca.repository.IdiomasRepository;

@Service
public class IdiomasService {

    @Autowired
    IdiomasRepository idiomasRepository;
    
    public List<Idioma> findAll(){
        return idiomasRepository.findAll();
    }

    /**
     * @param id_idioma
     * @return
     */
    public Optional<Idioma> findById(int id_idioma){
        return idiomasRepository.findById(id_idioma);
    }
    
    public Idioma save(Idioma m){
        return idiomasRepository.save(m);
    }
}
