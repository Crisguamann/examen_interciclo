package com.ista.evaluacionspringboot.web.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import org.springframework.transaction.annotation.Transactional;

import com.ista.evaluacionspringboot.web.app.entity.Empleado;
import com.ista.evaluacionspringboot.web.app.repository.EmpleadoRepositoty;


@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepositoty empleadoRepositoty;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Empleado> findAll() {
		// TODO Auto-generated method stub
		return empleadoRepositoty.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Page<Empleado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return empleadoRepositoty.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Empleado> findById(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepositoty.findById(id);
	}

	@Override
	@Transactional
	public Empleado save(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoRepositoty.save(empleado);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		empleadoRepositoty.deleteById(id);
	}



}
