package com.adrianfd23.tarea3dwesadrianfd23.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;
import com.adrianfd23.tarea3dwesadrianfd23.repository.PlantaRepository;

@Service
public class ServiciosPlanta {
	
@Autowired 
private PlantaRepository plantarepo;

	public void insertarPlanta(Planta p) {
		plantarepo.saveAndFlush(p);
	
	}

	public boolean validarPlanta(Planta p) {
		
		//if(plantarepo.existeCodigo(p)) {
			//return false;
		//}
		return true;
		
	}

	

}
