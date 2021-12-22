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

import com.postulacion.avla.model.Contacto;
import com.postulacion.avla.service.IContactoService;

@RestController
@RequestMapping("/contactos")
public class ContactoController {

	@Autowired
	private IContactoService service;

	@GetMapping
	public List<Contacto> listar() throws Exception {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Contacto listarPorId(@PathVariable("id") Integer id) throws Exception {
		return service.listarPorId(id);
	}

	@PostMapping
	public Contacto registrar(@RequestBody Contacto p) throws Exception {
		return service.registrar(p);
	}

	@PutMapping
	public Contacto modificar(@RequestBody Contacto p) throws Exception {
		return service.modificar(p);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}

}
