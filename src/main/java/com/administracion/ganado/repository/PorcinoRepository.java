package com.administracion.ganado.repository;

import com.administracion.ganado.model.Porcino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PorcinoRepository extends JpaRepository<Porcino, Long> {
    List<Porcino> findByNumeroParto(Integer numeroParto);
}
