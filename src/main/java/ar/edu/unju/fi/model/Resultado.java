package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase que representa el resultado de un partido
 * @author hernan humana
 *
 */
//definimos Resultado como un bean
@Component
public class Resultado {
	//---ATRIBUTOS---
	/**
	 * atributo que representa fecha del partido
	 */
	private LocalDate fecha;
	/**
	 * atributo que representa el nombre del primer equipo
	 */
	//aplicamos inyeccion de dependencias
	@Autowired
	private Equipo equipo1;
	/**
	 * atributo que representa el nombre del segundo equipo
	 */
	//aplicamos inyeccion de dependencias
	@Autowired
	private Equipo equipo2;
	/**
	 * atributo que representa los goles del primer equipo
	 */
	private int golesEquipo1;
	/**
	 * atributo que representa los goles del segundo equipo
	 */
	private int golesEquipo2;
	//---CONSTRUCTORES---
	/**
	 * Constructor por defecto
	 */
	public Resultado() {
		
	}
	/**
	 * Constructor parametrizado
	 * 
	 * @param fecha valor fecha
	 * @param equipo1 valor equipo1
	 * @param equipo2 valor equipo2
	 * @param golesEquipo1 valor golesEquipo1
	 * @param golesEquipo2 valor golesEquipo2
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}
	
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
	 * Devuelve el valor de equipo1
	 * @return this.equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}
	/**
	 * Asigna un valor a equipo1
	 * @param equipo1 valor equipo1
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	/**
	 * Devuelve el valor de equipo2
	 * @return this.equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}
	/**
	 * Asigna un valor a equipo1
	 * @param equipo1 valor equipo1
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	/**
	 * Devuelve el valor de  golesEquipo1
	 * @return this.golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	/**
	 * Asigna un valor a golesEquipo1
	 * @param golesEquipo1 valor golesEquipo1
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	/**
	 * Devuelve el valor de golesEquipo2
	 * @return this.golesEquipo1
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	/**
	 * Asigna un valor a golesEqupo2
	 * @param golesEquipo2 valor golesEquipo2
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	@Override
	public String toString() {
		return "Resultado [fecha=" + fecha + ", equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", golesEquipo1="
				+ golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + "]";
	}
	
	
	
	
}
