package ar.edu.unju.fi.reporitory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Humana3884Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {
	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Humana3884Tp5Application.class);
	
	@Override
	public void guardar() {
		LOG.info("la cuota asignada fue registrada $"+cuota.getMonto());

	}

	@Override
	public Cuota mostrar() {
		LOG.info("Mostrar los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		LOG.info("se elimino la cuota de la bd");

	}

	@Override
	public Cuota modificar() {
		LOG.info("se ha modificado"+"$"+cuota.getMonto());
		return cuota;
	}

}
