package com.adrianfd23.tarea3dwesadrianfd23.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Ejemplar;
import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;

import jakarta.transaction.Transactional;

@Repository
public interface EjemplarRepository extends JpaRepository<Ejemplar, Long> {

	@Query("SELECT e FROM Ejemplar e WHERE e.nombre = :nombre")
	List<Ejemplar> findEjemplaresByNombre(@Param("nombre")String nombre);
	
	@Transactional
	@Modifying
	@Query("UPDATE Ejemplar e SET e.nombre = :nombre WHERE e.id = :id")
	int actualizarNombreEjemplar(@Param("id") Long id, @Param("nombre") String nombre);
	
	
	default Long ultimoIdEjemplarByPlanta (Planta p) {
		List<Ejemplar> lista = findAll(); 
		if (!lista.isEmpty()) {
			long ret=0;
			for (Ejemplar e:lista)
				if(e.getPlanta().getId().equals(p.getId()))
					ret++;
			return ret;
			}
		return null;
		
		}
	}
