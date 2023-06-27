package com.dswii.portalalumnos.carrera;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("carreras")
public class CarreraController {
    CarreraRepository carreraRepository;

    @GetMapping
    public Iterable<Carrera> list() {
        return this.carreraRepository.findAll();
    }
}
