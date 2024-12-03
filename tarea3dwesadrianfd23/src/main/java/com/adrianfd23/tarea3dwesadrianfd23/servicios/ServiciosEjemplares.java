package com.adrianfd23.tarea3dwesadrianfd23.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Ejemplar;
import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;
import com.adrianfd23.tarea3dwesadrianfd23.repository.EjemplarRepository;

@Service

public class ServiciosEjemplares {

	@Autowired
	private EjemplarRepository ejemplarrepo;
	
	public List<Ejemplar> findEjemplaresByNombre (String nombre){
		return ejemplarrepo.findEjemplaresByNombre (nombre);
	}
	
	public int actualizarNombreEjemplar(Long id, String nombre) {
		return ejemplarrepo.actualizarNombreEjemplar(id, nombre);
	}
	
	public Long ultimoIdEjemplarByPlanta(Planta p) {
		if(p!=null)
			return ejemplarrepo.ultimoIdEjemplarByPlanta(p);
		else
			return null;
	}
	
	public void actualizar(Ejemplar e) {
		ejemplarrepo.saveAndFlush(e);
	}
	
	
	
}
