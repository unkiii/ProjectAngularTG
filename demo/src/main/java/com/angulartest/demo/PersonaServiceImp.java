package com.angulartest.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {
	
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	@Override
	public List<Persona> listar() {
		return personaRepositorio.findAll();
	}

	@Override
	public Persona findOne(int id) {
		return personaRepositorio.findById(id);
	}

	@Override
	public Persona add(Persona p) {
		return personaRepositorio.save(p);
	}

	@Override
	public Persona edit(Persona p) {
		return personaRepositorio.save(p);
	}

	@Override
	public Persona delete(int id) {
		throw new UnsupportedOperationException("delete No Soportado");
	}

}
