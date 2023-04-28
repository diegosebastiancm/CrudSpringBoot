package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.web.entidad.Estudiante;
import com.app.web.servicio.EstudianteServicio;

@Controller
public class EstudianteControlador {
	
@Autowired
private EstudianteServicio servicio;

@GetMapping({"/estudiantes","/"})

public String listarEstudiantes(Model modelo) {
	modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
	return "estudiantes"; //nos retorna al archivo estudiantes
	
}


@GetMapping("/estudiantes/nuevo")
public String crearEstudiantesFormulario(Model modelo) {
	Estudiante estudiante = new Estudiante();
	modelo.addAttribute("estudiante",estudiante);
	return"crear:estudiante";
}
}
