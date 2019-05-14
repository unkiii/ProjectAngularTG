package com.angulartest.demo;

import java.util.List;

import org.springframework.data.repository.Repository;


public interface PersonaRepositorio extends Repository<Persona, Integer> {
	List<Persona>findAll();
	Persona save(Persona p);
	Persona findById(int id);	
	Persona delete(Persona p);
}
