package com.example.respositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.entidad.Libro;

@Repository
public class LibroMysqlRepositorio implements LibroRepositorio{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertarLibro(Libro obj) {
		return jdbcTemplate.update("insert into libro values(null,?,?,?)",new Object[]{obj.getNombre(), obj.getPrecio(), obj.getAutor()});
	}

}
