package com.adrianfd23.tarea3dwesadrianfd23;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Ejemplar;
import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;
import com.adrianfd23.tarea3dwesadrianfd23.servicios.ServiciosEjemplares;
import com.adrianfd23.tarea3dwesadrianfd23.servicios.ServiciosPlanta;

public class Principal implements CommandLineRunner {
	
	private static final Logger Log = LoggerFactory.getLogger(Principal.class);
	
	@Autowired
	ServiciosPlanta servplant;
	@Autowired
	ServiciosEjemplares servejemplar;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("INI");
		Log.info("--------------");
		
		String nombre = "Rosa_2";
		List<Ejemplar> listaejemplares = servejemplar.findEjemplaresByNombre(nombre);
		
		for(Ejemplar e : listaejemplares) {
			servejemplar.actualizarNombreEjemplar(e.getId(), e.getNombre());
			
		}
		
		
		Planta p1 = new Planta();
		p1.setCodigo("Margarita");
		p1.setNombrecomun("Margarita");
		p1.setNombrecientifico("Margarita común");
		
		
		
		
		
		
		System.out.println("Fin");
	}
	
}
