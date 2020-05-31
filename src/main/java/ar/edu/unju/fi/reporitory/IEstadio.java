package ar.edu.unju.fi.reporitory;

import ar.edu.unju.fi.model.Estadio;

public interface IEstadio {
	public void guardar();
	public Estadio mostrar();
	public void eliminar();
	public Estadio modificar();
}
