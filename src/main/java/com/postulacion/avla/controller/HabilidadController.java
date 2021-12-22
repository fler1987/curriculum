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

import com.postulacion.avla.model.Habilidad;
import com.postulacion.avla.service.IHabilidadService;

@RestController
@RequestMapping("/habilidades")
public class HabilidadController {

	@Autowired
	private IHabilidadService service;	
	
	@GetMapping
	public List<Habilidad> listar() throws Exception {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Habilidad listarPorId(@PathVariable("id") Integer id) throws Exception {
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Habilidad registrar(@RequestBody Habilidad p) throws Exception {
		return service.registrar(p);
	}
	
	@PutMapping
	public Habilidad modificar(@RequestBody Habilidad p) throws Exception {
		return service.modificar(p);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
	
}
