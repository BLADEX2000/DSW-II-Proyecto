package com.dswii.portalalumnos.grado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("grados")
public class GradoController {
    GradoRepository gradoRepository;

    @GetMapping
    public Iterable<Grado> list(){
        return this.gradoRepository.findAll();
    }
}
