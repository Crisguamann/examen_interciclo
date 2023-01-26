package com.ista.evaluacionspringboot.web.app.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Nonnull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empleado;
	
	@Nonnull
	@Column(name="apellido", length = 45)
	private String apellido;
	
	@Nonnull
	@Column(name="nombre", length = 45)
	private String nombre;
	
	@Nonnull
	@Column(name="telefono", length = 15)
	private String telefono;
	
	@Nonnull
	@Column(name="direccion", length = 45)
	private String direccion;
	
	@Nonnull
	private Date fecha_nacimiento;
	
	@Nonnull
	@Column(name="observacion", length = 45)
	private String observacion;
	
	@Nonnull
	private int dias_trabajo;
	
	@Nonnull
	private double sueldo;

	public Long getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Long id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getDias_trabajo() {
		return dias_trabajo;
	}

	public void setDias_trabajo(int dias_trabajo) {
		this.dias_trabajo = dias_trabajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
