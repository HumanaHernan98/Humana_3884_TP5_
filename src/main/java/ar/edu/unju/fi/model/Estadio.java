package ar.edu.unju.fi.model;

import java.time.LocalDate;

/**
 * Clase que representa un estadio
 * 
 * @author Hernan Humana
 *
 */
public class Estadio {
	/**
	 * atributo que representa el nombre del estadio
	 */
	private String nombre;
	/**
	 * atributo que representa la fecha de fundacion del estadi0
	 */
	private LocalDate fechaFundacion;
	/**
	 * atributo que representa nombre de ciudad donde se ubica el estadio
	 */
	private String ciudad;
	/**
	 * atributo que representa la capacidad que tiene el estadio
	 */
	private int capacidad;
	/**
	 * atributo que representa el la direccion del estadio
	 */
	private String direccion;
	
	//----CONSTRUCTORES----
	
	/**
	 * Constructor por defecto
	 */
	public Estadio() {
		
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre valor nombre 
	 * @param fechaFundacion valor fechafundacion
	 * @param ciudad valor ciudad
	 * @param capacidad valor capacidad
	 * @param direccion valor capacidad
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}
	
	//---METODOS ACCESORES---
	/**
	 * Devuelve el nombre del estadio
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor al atributo nombre 
	 * @param nombre valor nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor de fechaFunfacion 
	 * @return this.fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * Asigna un valor a fechaFundacion 
	 * @param fechaFundacion valor fechaFundacion
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * Devuelve el valor de ciudad
	 * @return this.ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Asigna un valor a ciudad
	 * @param ciudad valor ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Devuelve el calor de capacidad
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Asigna un valor a capacidad
	 * @param capacidad valor capacidad 
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Devuelve el valor de direccion 
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Asigna un valora a direccion
	 * @param direccion valor direccion 
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Estadio [nombre=" + nombre + ", fechaFundacion=" + fechaFundacion + ", ciudad=" + ciudad
				+ ", capacidad=" + capacidad + ", direccion=" + direccion + "]";
	}

}
