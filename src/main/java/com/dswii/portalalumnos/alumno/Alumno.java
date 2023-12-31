package com.dswii.portalalumnos.alumno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.dswii.portalalumnos.carrera.Carrera;
import com.dswii.portalalumnos.grado.Grado;
import com.dswii.portalalumnos.seccion.Seccion;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idalumno;

    @NotBlank
    private String nomalumno;

    @NotBlank
    private String apealumno;

    @NotBlank
    @Pattern(regexp ="/d{9}/")
    private String telfalumno;

    @ManyToOne
    @JoinColumn(name = "idseccion")
    private Seccion seccion;

    @ManyToOne
    @JoinColumn(name = "idgrado")
    private Grado grado;

    @ManyToOne
    @JoinColumn(name = "idcarrera")
    private Carrera carrera;
}
