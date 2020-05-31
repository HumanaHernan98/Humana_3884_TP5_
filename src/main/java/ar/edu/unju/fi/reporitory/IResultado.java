package ar.edu.unju.fi.reporitory;

import ar.edu.unju.fi.model.Resultado;

public interface IResultado {
	public void guardar();
	public Resultado mostrar();
	public void eliminar();
	public Resultado modificar();
}
