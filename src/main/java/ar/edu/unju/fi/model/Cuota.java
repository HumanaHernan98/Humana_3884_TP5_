package ar.edu.unju.fi.model;

import java.time.LocalDate;

/**
 * clase que representa una cuota de un servicio
 * @author hernan humana
 *
 */
public class Cuota {
	//---ATRIBUTOS---
	/**
	 * atributo que representa el id de una cuota 
	 */
	private long id;
	/**
	 * atributo que representa la fecha de pago de una cuota
	 */
	private LocalDate fechaPago;
	/**
	 * atributo que representa un perido de cuenta
	 */
	private String periodo;
	/**
	 * atributo que representa el monto de una cuota
	 */
	private double monto;
	/**
	 * atributo que representa el estado de una cuenta
	 */
	private String estado;
	/**
	 * atributo que representa el usuario de una cuenta
	 */
	private Usuario usuario;
	//---CONSTRUCTORES---
	/**
	 * Constructor por defecto
	 */
	public Cuota() {
		
	}
	/**
	 * Constructor parametrizado
	 * @param id valor id
	 * @param fechaPago valor fechaPago
	 * @param periodo valor periodo
	 * @param monto valor monto
	 * @param estado valor estado
	 * @param usuario vaor usuario
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}
	//---METODOS ACCESORES---
	/**
	 * Devuelve el valor de id
	 * @return this.id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Asigna un valor a id
	 * @param id valor id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Devuelve el valor de fechaPago
	 * @return this.fechaPago
	 */
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	/**
	 * Asigna un valor a fechapago
	 * @param fechaPago valor fechaPago
	 */
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	/**
	 * Devuelve  el valor de periodo
	 * @return this.periodo
	 */
	public String getPeriodo() {
		return periodo;
	}
	/**
	 * Asigna un valor a periodo
	 * @param periodo valor periodo
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	/**
	 * Devuelve el valor de monto
	 * @return this.monto
	 */
	public double getMonto() {
		return monto;
	}
	/**
	 * Asigna un valor a monto
	 * @param monto valor monto 
	 */
	public void setMonto(double monto) {
		this.monto = monto;
	}
	/**
	 * Devuelve el valor de estado
	 * @return this.estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * Asigna un valor a estado
	 * @param estado valor estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * Devuelve el valor de usuario
	 * @return this.usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * Asigna un valor a usuario
	 * @param usuario valor usuario 
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fechaPago=" + fechaPago + ", periodo=" + periodo + ", monto=" + monto
				+ ", estado=" + estado + ", usuario=" + usuario + "]";
	}
	
	
}
