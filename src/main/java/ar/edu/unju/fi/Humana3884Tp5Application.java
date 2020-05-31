package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.reporitory.ICuota;
import ar.edu.unju.fi.reporitory.IEstadio;
import ar.edu.unju.fi.reporitory.IResultado;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Humana3884Tp5Application implements CommandLineRunner {
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	@Autowired
	IEstadio estadioservice;
	@Autowired
	Estadio estadio;
	@Autowired
	IEquipoService equipoService;
	@Autowired
	IEquipoService equipoService1;
	@Autowired
	Equipo equipo;
	@Autowired
	Equipo equipo1;
	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;
	@Autowired 
	IResultado resultadoService;
	@Autowired 
	Resultado resultado;
	@Autowired
	ICuota cuotaService;
	@Autowired
	Cuota cuota;

	public static void main(String[] args) {
		SpringApplication.run(Humana3884Tp5Application.class, args);
	}

	public void run(String... arg) throws Exception {
		// inicializacion de las variables de mi objeto usuario
		usuario.setApellido("humana");
		usuario.setDireccion("las tipas -palpalà");
		usuario.setDni(41609810);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1998, 11, 18));
		usuario.setId(1);
		usuario.setNombre("hernan");
		usuario.setPassword("123");
		usuario.setTipo("SOCIO");
		usuarioService.guardar();

		// inicializacion de las variables de mi objeto estadio
		estadio.setNombre("arroyito");
		estadio.setFechaFundacion(LocalDate.of(2001, 03, 15));
		estadio.setCiudad("palpalà");
		estadio.setCapacidad(500);
		estadio.setDireccion("B° gral savio c:ameguino");
		estadioservice.guardar();

		// inicializacion de las variables de mi objeto equipo
		equipo.setNombre("delbarrioFC");
		equipo.setEstadio(estadio);
		equipoService.guardar();
		
		equipo1.setNombre("sacachispa");
		equipo1.setEstadio(estadio);
		equipoService1.guardar();
		
		// inicializacion de las variables de mi objeto noticia
		noticia.setTitulo("caballos enfermos");
		noticia.setFecha(LocalDate.of(2020, 04, 12));
		noticia.setResumen("manadas de caballos mueren por una enfermedad que ataca sus pulmones");
		noticiaService.guardar();
		// inicializacion de las variables de mi objeto resultado
		resultado.setEquipo1(equipo);
		resultado.setGolesEquipo1(3);
		resultado.setEquipo2(equipo1);
		resultado.setGolesEquipo2(3);
		resultado.setFecha(LocalDate.now());
		resultadoService.guardar();
		//inicializacion de las variables de mi objeto cuota
		cuota.setEstado("activo");
		cuota.setFechaPago(LocalDate.of(2020, 5, 21));
		cuota.setId(1);
		cuota.setMonto(5000);
		cuota.setPeriodo("3 años");
		cuota.setUsuario(usuario);
		cuotaService.guardar();
		
		
		
		
		
	}

}
