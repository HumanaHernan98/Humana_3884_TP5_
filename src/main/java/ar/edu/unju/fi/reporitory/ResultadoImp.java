package ar.edu.unju.fi.reporitory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Humana3884Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {
	@Autowired
	private Resultado resultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Humana3884Tp5Application.class);
	
	@Override
	public void guardar() {
		LOG.info("El resultado fue guardado"+ resultado.getEquipo1()+" "+resultado.getGolesEquipo1()+"a"+resultado.getEquipo2()+" "+resultado.getGolesEquipo2());
	}

	@Override
	public Resultado mostrar() {
		LOG.info("Mostrar resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		LOG.info("se elimino el resultado de la bd");

	}

	@Override
	public Resultado modificar() {
		LOG.info("se ha modificado"+resultado.getEquipo1()+" "+resultado.getGolesEquipo1()+"a"+resultado.getEquipo2()+" "+resultado.getGolesEquipo2());
		return resultado;
	}

}
