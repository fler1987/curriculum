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

import com.postulacion.avla.model.Experiencia;
import com.postulacion.avla.service.IExperienciaService;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaController {

	@Autowired
	private IExperienciaService service;	
	
	@GetMapping
	public List<Experiencia> listar() throws Exception {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Experiencia listarPorId(@PathVariable("id") Integer id) throws Exception {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Experiencia registrar(@RequestBody Experiencia p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Experiencia modificar(@RequestBody Experiencia p) throws Exception {
		return service.modificar(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
	
}
