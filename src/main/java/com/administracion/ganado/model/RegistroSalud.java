package com.administracion.ganado.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class RegistroSalud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaAtencion;
    private String tipoAtencion;
    private String descripcion;

    @ManyToOne
    private Animal animal;
}
