package com.adrianfd23.tarea3dwesadrianfd23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrianfd23.tarea3dwesadrianfd23.modelo.Planta;
@Repository
public interface PlantaRepository extends JpaRepository<Planta, Long> {


}
