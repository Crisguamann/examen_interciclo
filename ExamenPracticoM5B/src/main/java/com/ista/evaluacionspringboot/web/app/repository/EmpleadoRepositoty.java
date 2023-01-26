package com.ista.evaluacionspringboot.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ista.evaluacionspringboot.web.app.entity.Empleado;

@Repository
public interface EmpleadoRepositoty extends JpaRepository<Empleado, Long> {

}
