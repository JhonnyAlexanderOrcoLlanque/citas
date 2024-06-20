//CitaRepository.java
package com.sis324.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.citas.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}