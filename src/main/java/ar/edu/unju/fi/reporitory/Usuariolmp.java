package ar.edu.unju.fi.reporitory;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Humana3884Tp5Application;
import ar.edu.unju.fi.model.Usuario;

@Repository("usuarioImp")
public class Usuariolmp implements IUsuario {
	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Humana3884Tp5Application.class);
	
	@Override
	public void guardar() {
		LOG.info("El usuario fue guardado "+usuario.getApellido()+", "+usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		LOG.info("se elimino el usuario de la bd");

	}

	@Override
	public Usuario modificar() {
		LOG.info("se ha modificado"+usuario.getApellido()+", "+usuario.getNombre());
		return usuario;
	}

}
