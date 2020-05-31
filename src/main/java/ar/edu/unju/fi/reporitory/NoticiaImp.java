package ar.edu.unju.fi.reporitory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Humana3884Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository("noticiasImp")
public class NoticiaImp implements INoticia {
	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Humana3884Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("la noticia fue guardada "+noticia.getTitulo());

	}

	@Override
	public Noticia mostrar() {
		LOG.info("Mostrar los datos de noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		LOG.info("se elimino la noticia de la bd");

	}

	@Override
	public Noticia modificar() {
		LOG.info("se ha modificado"+noticia.getTitulo());
		return noticia;
	}

}
