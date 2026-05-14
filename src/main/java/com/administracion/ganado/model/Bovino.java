package com.administracion.ganado.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Bovino extends Animal {

    private String raza;
    private String proposito;
    private Integer mesesGestacion;



}
