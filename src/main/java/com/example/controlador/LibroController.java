package com.example.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entidad.Libro;
import com.example.servicio.LibroServicio;
@Controller
public class LibroController {
	
	@Autowired
	private LibroServicio servicio;
	@RequestMapping("/verLibro")
	public String metVerLibro() {
		return "registraLibro";
	}
	@RequestMapping("/registroDelLibro")
	public String metRegistrarLibro(Libro obj) {
		servicio.insertarlibro(obj);
		return "registrarLibro";
	}

}
