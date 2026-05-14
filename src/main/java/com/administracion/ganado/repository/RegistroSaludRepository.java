package com.administracion.ganado.repository;

import com.administracion.ganado.model.RegistroSalud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroSaludRepository extends JpaRepository<RegistroSalud,Long> {
    List<RegistroSalud> findByAnimalId(Long animalId);
    List<RegistroSalud> findByAnimalIdAndTipoAtencion(Long animalId, String tipoAtencion);
}
