package com.administracion.ganado.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
              include = JsonTypeInfo.As.PROPERTY,
              property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = Bovino.class,name = "bovino"),
               @JsonSubTypes.Type(value = Ovino.class,name = "ovino"),
               @JsonSubTypes.Type(value = Porcino.class,name = "porcino"),
               @JsonSubTypes.Type(value = Equino.class,name = "equino"),
               @JsonSubTypes.Type(value = Animal.class,name = "ave")})
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caravana;
    private LocalDate fechaNacimiento;
    private Double pesoKg;
    private String genero;
    private String color;

}
