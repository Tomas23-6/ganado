package com.administracion.ganado.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Ave extends Animal{
    private String loteProcedencia;
    private Integer posturaDiaria;
    private Double consumoAlimento;
    private String Color;

}
