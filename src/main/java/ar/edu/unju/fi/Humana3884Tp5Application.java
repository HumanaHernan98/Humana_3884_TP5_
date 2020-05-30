package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Humana3884Tp5Application implements CommandLineRunner{
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;

	public static void main(String[] args) {
		SpringApplication.run(Humana3884Tp5Application.class, args);
	}
	
	public void run(String... arg) throws Exception{
		//inicializacion de las variables de mi objeto usuario
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
		
	}

}
