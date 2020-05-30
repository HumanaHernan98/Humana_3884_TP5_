package ar.edu.unju.fi.model;

/**
 * Clase que representa un equipo.
 * 
 * @author Hernan Humana
 *
 */
public class Equipo {
	/*
	 *atributo que representa el nombre de un equipo 
	 */
	private String nombre;
	/*
	 * atributo que representa un estadio
	 */
	private Estadio estadio;
	
	//----CONSTRUCTORES----
	
	/**
	 * constructor por defecto
	 */
	public Equipo() {
		
	}

	/**
	 * constructor parametrizado
	 * 
	 * @param nombre valor nombre
	 * @param estadio valor estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
	
	//---METODOS ACCESORES---
	
	/**
	 * Devuelve el valor de nombre
	 * @return this.nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna un valor a nombre
	 * @param nombre valor nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor de estadio
	 * @return this.estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Asigna un valor a estadio
	 * @param estadio valor estadio
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	@Override
	public String toString() {
	return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
}
	

}
