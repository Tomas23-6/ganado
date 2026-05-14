package com.administracion.ganado.repository;

import com.administracion.ganado.model.Equino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquinoRepository extends JpaRepository<Equino,Long> {
}
