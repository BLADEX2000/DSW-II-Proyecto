package com.dswii.portalalumnos.profesor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprofesor;

    @NotBlank
    private String nomprofesor;

    @NotBlank
    private String apeprofesor;

    @Pattern(regexp ="/d{9}/")
    @NotBlank
    private String telfprofesor;

}
