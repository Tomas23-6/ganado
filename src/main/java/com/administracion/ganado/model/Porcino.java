package com.administracion.ganado.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Porcino extends Animal{
    private Integer numeroParto;
    private Integer CerdoNacido;
    private Double PesoCria;
    private Double espesorGrasa;
}
