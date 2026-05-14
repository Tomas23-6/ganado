package com.administracion.ganado.repository;

import com.administracion.ganado.model.Productor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductorRepository extends JpaRepository<Productor, Long> {
}
