package com.administracion.ganado.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Equino extends Animal{
    private Double Alzada;
    private String capa;
    private String usoAptitud;
    private Integer marca;
}
