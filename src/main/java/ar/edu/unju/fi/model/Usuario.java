package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * clase que represneta un usuario
 * @author hernan humana
 *
 */
//definimos Usuario como un bean
@Component
public class Usuario {

	//atributos
	/**
	 * atributo que representa un identificador del usuario
	 */
	private long id;
	/**
	 * atributo que representa el nombre del usuario
	 */
	private String  nombre;
	/**
	 * atributo que representa el apellido del usuario
	 */
	private String  apellido;
	/**
	 * atributo que representa fecha de nacimiento del usuario
	 */
	private LocalDate fechaNacimiento;
	/**
	 * atributo que representa la direccion del usuario
	 */
	private String direccion;
	/**
	 * atributo que representa el DNI del usuario
	 */
	private long dni;
	/**
	 * atributo que representa una fecha
	 */
	private LocalDate fechaAlta;
	/**
	 * atributo que representa tipo de usuario
	 */
	private String tipo;
	/**
	 * atributo que representa un password
	 */
	private String password;
	
	//---CONSTRUCTORES---
	/**
	 * Constructor por defecto
	 */
	public Usuario() {
		
	}
	/**
	 * constructor paramatrizado
	 * 
	 * @param id valor id
	 * @param nombre valor nombre 
	 * @param apellido valor apellido
	 * @param fechaNacimiento valor fechaNaciminto
	 * @param direccion valor direccion
	 * @param dni valor dni
	 * @param fechaAlta valor fechaAlta
	 * @param tipo valor tipo
	 * @param password valo password
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo , String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo=tipo;
		this.password = password;
	}

	//---METODOS ACCESORES---
	/**
	 * Devueve el valor de id
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
	 * Devuelve el valor de apellido
	 * @return this.apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Asigna un valor a apellio 
	 * @param apellido valor apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Devuelve el valor de fechaNacimiento
	 * @return this.fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * Asigna un valor a fechaNacimiento
	 * @param fechaNacimiento valor fechaNacimiento
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * Devuelve el valor de direccion
	 * @return this.direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Asigna un valor a direccion
	 * @param direccion valor direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Devuelve el valor de DNI
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}
	/**
	 * Asigna un valor a DNI
	 * @param dni valor dni
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}
	/**
	 * Devuelve el valor de fechaAlta
	 * @return this.fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * Asigna un valor a fechaAlta
	 * @param fechaAlta valor fechaAlta
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * Devuelve el valor de tipo
	 * @return this.tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * Asigna un valor a tipo
	 * @param tipo valor tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Devuelve el valor de contraseña
	 * @return this.password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Asigna un valor a contraseña
	 * @param password valor password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", dni=" + dni + ", fechaAlta=" + fechaAlta
				+ ", tipo=" + tipo + ", password=" + password + "]";
	}
	
}
