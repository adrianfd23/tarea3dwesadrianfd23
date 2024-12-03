package com.adrianfd23.tarea3dwesadrianfd23.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;

import jakarta.transaction.Transactional;


@Repository
public interface PlantaRepository extends JpaRepository<Planta, Long> {
	
	@Query("SELECT e FROM Planta e WHERE e.nombrecomun = :nombrecomun")
	List<Planta> findPlantasByNombre(@Param("nombrecomun")String nombrecomun);
	
	@Transactional
	@Modifying
	@Query("UPDATE Planta e SET e.nombrecomun = :nombrecomun WHERE e.id = :id")
	int actualizarNombrePlanta(@Param("id") Long id, @Param("nombrecomun") String nombrecomun);
	
	
}
