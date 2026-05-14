package com.administracion.ganado.repository;

import com.administracion.ganado.model.Ave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AveRepository extends JpaRepository<Ave, Long> {
}
