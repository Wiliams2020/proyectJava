package com.example.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entidad.Libro;
import com.example.respositorio.LibroRepositorio;

@Service
public class LibroServicioImpl implements LibroServicio{
	@Autowired
	private LibroRepositorio repositorio;

	@Override
	public int insertarlibro(Libro obj) {
		// TODO Auto-generated method stub
		return repositorio.insertarLibro(obj);
	}
	
	

}
