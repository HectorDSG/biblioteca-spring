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

import com.tecnm.biblioteca.entity.Editorial;
import com.tecnm.biblioteca.service.EditorialesService;


@RestController
@RequestMapping("/editoriales")
public class EditorialesController {


    @Autowired
    EditorialesService editorialesService;

    @GetMapping("/")
    public List<Editorial> getAll() {
        return editorialesService.findAll();
    }

    @GetMapping(value = "/id/{id_editorial}")
    public Optional<Editorial> findById(@PathVariable Integer id_editorial) {
        return editorialesService.findById(id_editorial);
    }

    @PostMapping("/")
    public Editorial postMethodName(@RequestBody Editorial editorial) {        
        return editorialesService.save(editorial);
    }
    

}
