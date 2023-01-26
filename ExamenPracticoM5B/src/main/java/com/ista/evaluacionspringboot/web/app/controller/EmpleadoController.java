package com.ista.evaluacionspringboot.web.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.evaluacionspringboot.web.app.entity.Empleado;
import com.ista.evaluacionspringboot.web.app.service.EmpleadoService;

@RestController
@RequestMapping("api/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Empleado empleado){
		return ResponseEntity.status(HttpStatus.CREATED).body(empleadoService.save(empleado));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id")Long empleadoId){
		Optional<Empleado> oEmpleado = empleadoService.findById(empleadoId);
		if(!oEmpleado.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oEmpleado);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Empleado empDetails, @PathVariable(value = "id") Long empId){
		Optional<Empleado> empleado = empleadoService.findById(empId);
		if(!empleado.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		empleado.get().setApellido(empDetails.getApellido());
		empleado.get().setNombre(empDetails.getNombre());
		empleado.get().setTelefono(empDetails.getTelefono());
		empleado.get().setDireccion(empDetails.getDireccion());
		empleado.get().setFecha_nacimiento(empDetails.getFecha_nacimiento());
		empleado.get().setObservacion(empDetails.getObservacion());
		empleado.get().setDias_trabajo(empDetails.getDias_trabajo());
		empleado.get().setSueldo(empDetails.getSueldo());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(empleadoService.save(empleado.get()));

		
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable(value="id") Long empId){
		if(!empleadoService.findById(empId).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		empleadoService.deleteById(empId);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public List<Empleado> readAll(){
		List<Empleado> empl = StreamSupport
				.stream(empleadoService.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return empl;
	}
	
}
