package com.tecnm.biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnm.biblioteca.entity.Editorial;
import com.tecnm.biblioteca.repository.EditorialesRepository;

@Service
public class EditorialesService {

    @Autowired
    EditorialesRepository editorialesRepository;
    
    public List<Editorial> findAll(){
        return editorialesRepository.findAll();
    }

    /**
     * @param id_editorial
     * @return
     */
    public Optional<Editorial> findById(int id_editorial){
        return editorialesRepository.findById(id_editorial);
    }
    
    public Editorial save(Editorial edtl){
        return editorialesRepository.save(edtl);
    }
}
