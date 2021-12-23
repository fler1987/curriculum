package com.postulacion.avla.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.postulacion.avla.model.Estudios;
import com.postulacion.avla.model.Experiencia;
import com.postulacion.avla.model.Habilidad;
import com.postulacion.avla.model.Participante;
import com.postulacion.avla.service.IContactoService;
import com.postulacion.avla.service.IEstudiosService;
import com.postulacion.avla.service.IExperienciaService;
import com.postulacion.avla.service.IHabilidadService;
import com.postulacion.avla.service.IParticipanteService;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

	@Autowired
	private IParticipanteService service;
	@Autowired
	private IHabilidadService habilidadService;
	@Autowired
	private IContactoService contactoService;
	@Autowired
	private IEstudiosService estudiosService;
	@Autowired
	private IExperienciaService experienciaService;

	@GetMapping
	public List<Participante> listar() throws Exception {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Participante listarPorId(@PathVariable("id") Integer id) throws Exception {
		return service.listarPorId(id);
	}

	@GetMapping("/{id}/full")
	public Map<String, Object> listarPorNombre(@PathVariable("id") Integer id) throws Exception {

		Map<String, Object> map = new HashMap<>();
		Participante participante = service.listarPorId(id);
		Integer idParticipante = participante.getId();

		List<Habilidad> habilidades = habilidadService.listarPorIdParticipante(idParticipante);
		List<Contacto> contactos = contactoService.listarPorIdParticipante(idParticipante);
		List<Estudios> estudios = estudiosService.listarPorIdParticipante(idParticipante);
		List<Experiencia> experiencias = experienciaService.listarPorIdParticipante(idParticipante);
		
		Map<String, Object> details = new HashMap<>();
		details.put("habilidades", habilidades);
		details.put("contactos", contactos);
		details.put("estudios", estudios);
		details.put("experiencias", experiencias);

		map.put("nombres", participante.getNombre());
		map.put("apellidoMaterno", participante.getApellidoMaterno());
		map.put("apellidoPaterno", participante.getApellidoPaterno());
		map.put("descripcion", participante.getDescripcion());
		map.put("celular", participante.getEmail());
		map.put("email", participante.getEmail());
		map.put("domicilio", participante.getDomicilio());
		map.put("fechaNacimiento", participante.getFechaNacimiento());
//		map.put("habilidades", habilidades);
//		map.put("contactos", contactos);
//		map.put("estudios", estudios);
//		map.put("experiencias", experiencias);
		map.put("details", details);
		
		return map;
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
