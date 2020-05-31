package ar.edu.unju.fi.reporitory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Humana3884Tp5Application;
import ar.edu.unju.fi.model.Equipo;



@Repository("equipoImp")
public class EquipoImp implements IEquipo {
	@Autowired
	private Equipo equipo;
	
	public static Logger LOG = LoggerFactory.getLogger(Humana3884Tp5Application.class);
	
	@Override
	public void guardar() {
		LOG.info("El equipo "+equipo.getNombre()+"fue registrado");
	}

	@Override
	public Equipo mostrar() {
		LOG.info("Mostrar los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		LOG.info("se elimino el equipo de la bd");

	}

	@Override
	public Equipo modificar() {
		LOG.info("se ha modificado "+equipo.getNombre());
		return equipo;
	}

}
