package com.administracion.ganado.repository;

import com.administracion.ganado.model.Bovino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BovinoRepository extends JpaRepository<Bovino,Long> {
}
