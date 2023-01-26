package com.ista.evaluacionspringboot.web.app.service;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.ista.evaluacionspringboot.web.app.entity.Empleado;

public interface EmpleadoService {

	public Iterable<Empleado> findAll();
	
	public Page<Empleado> findAll(Pageable pageable);
	
	public Optional<Empleado> findById(Long id);
	
	public Empleado save(Empleado empleado);
	
	public void deleteById(Long id);
}
