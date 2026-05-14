package com.administracion.ganado.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Ovino extends Animal{
    private Double finuraLana;
    private Double largoMecha;
    private Integer condicionCorporal;
    private String presenciaCuerno;
}
