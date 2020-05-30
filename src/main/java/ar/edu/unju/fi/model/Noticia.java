package ar.edu.unju.fi.model;

import java.time.LocalDate;

/**
 * clase que representa una noticia
 * 
 * @author hernan
 *
 */
public class Noticia {
	
	//---ATRIBUTOS---
	/**
	 * representa la fecha de emicion de noticia
	 */
	private LocalDate fecha;
	/**
	 * representa el titulo de la noticia 
	 */
	private String titulo;
	/**
	 * representa un resumen de la noticia 
	 */
	private String resumen;
	//---CONSTRUCTORES---
	/**
	 * Constructor por defecto
	 */
	public Noticia() {
		
	}
	/**
	 * Constructor parametrizado
	 * 
	 * @param fecha valor fecha 
	 * @param titulo valor titulo
	 * @param resumen valor resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	//---METODOS ACCESORES---
	/**
	 * Devuelve el valor de fecha
	 * @return this.fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * Asigna un valor a fecha
	 * @param fecha valor fecha
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * Devielve el valor de titulo
	 * @return this.titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Asigna un valor a titulo
	 * @param titulo valor titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Devuelve el valor de resumen
	 * @return this.resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * Asigna valor a resumen
	 * @param resumen valor resumen
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	@Override
	public String toString() {
		return "Noticia [fecha=" + fecha + ", titulo=" + titulo + ", resumen=" + resumen + "]";
	}
}
