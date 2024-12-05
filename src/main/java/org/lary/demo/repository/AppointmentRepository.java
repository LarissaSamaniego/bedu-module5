package org.lary.demo.repository;

import org.lary.demo.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    // Crear interfaz que extienda de JPA, indicar el tipo (model) de la tabla y la llave
}
