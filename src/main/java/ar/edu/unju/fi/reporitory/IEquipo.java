package ar.edu.unju.fi.reporitory;

import ar.edu.unju.fi.model.Equipo;

public interface IEquipo {
	public void guardar();
	public Equipo mostrar();
	public void eliminar();
	public Equipo modificar();
}
