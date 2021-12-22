package com.postulacion.avla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postulacion.avla.model.Participante;
import com.postulacion.avla.service.IParticipanteService;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

	@Autowired
	private IParticipanteService service;	
	
	@GetMapping
	public List<Participante> listar() throws Exception {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Participante listarPorId(@PathVariable("id") Integer id) throws Exception {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Participante registrar(@RequestBody Participante p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Participante modificar(@RequestBody Participante p) throws Exception {
		return service.modificar(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
	
}
