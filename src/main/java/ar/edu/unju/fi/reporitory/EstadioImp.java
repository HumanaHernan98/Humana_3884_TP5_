package ar.edu.unju.fi.reporitory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Humana3884Tp5Application;
import ar.edu.unju.fi.model.Estadio;


@Repository("estadioImp")
public class EstadioImp implements IEstadio {
	@Autowired
	private Estadio estadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Humana3884Tp5Application.class);
	
	
	@Override
	public void guardar() {
		LOG.info("El estadio "+estadio.getNombre()+" esta registrado");

	}

	@Override
	public Estadio mostrar() {
		LOG.info("Mostrar los datos del estadio");
		return estadio;
	}

	@Override
	public void eliminar() {
		LOG.info("se elimino el estadio de la bd");

	}

	@Override
	public Estadio modificar() {
		LOG.info("El estadio "+estadio.getNombre());
		return estadio;
	}

}
