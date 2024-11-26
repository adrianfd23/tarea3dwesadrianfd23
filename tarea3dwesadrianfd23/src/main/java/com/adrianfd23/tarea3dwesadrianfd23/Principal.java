package com.adrianfd23.tarea3dwesadrianfd23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;
import com.adrianfd23.tarea3dwesadrianfd23.servicios.ServiciosPlanta;

public class Principal implements CommandLineRunner {
	
	private static final Logger Log = LoggerFactory.getLogger(Principal.class);
	
	@Autowired
	ServiciosPlanta servplant;
	
	
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("INI");
		
		Planta p = new Planta();
		servplant.validarPlanta(p);
		
		servplant.insertarPlanta(p);
		
		
		
		System.out.println("-------------------");
		
		
		
		
		
		System.out.println("Fin");
	}
	
}
