package com.dswii.portalalumnos.seccion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("secciones")
public class SeccionController {

    SeccionRepository seccionRepository;

    @GetMapping
    public Iterable<Seccion>  list(){
        return this.seccionRepository.findAll();
    }
}
