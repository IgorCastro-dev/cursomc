package com.empresa.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.cursomc.domain.Categorias;


@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categorias> listar() {
		Categorias cat1 = new Categorias(1,"informatica");
		Categorias cat2 = new Categorias(2,"escritorio");
		
		List<Categorias> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
}
