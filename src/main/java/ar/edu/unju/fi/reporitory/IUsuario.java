package ar.edu.unju.fi.reporitory;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuario {
	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
}
