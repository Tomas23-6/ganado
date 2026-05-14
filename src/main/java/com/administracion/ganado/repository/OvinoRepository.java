package com.administracion.ganado.repository;

import com.administracion.ganado.model.Ovino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OvinoRepository extends JpaRepository<Ovino,Long> {
    List<Ovino> findByFinuraLanaLessThan(Double maxFinuraLana);
}
