package com.postulacion.avla.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/")
public class CurriculumController {

	@Autowired
	private IParticipanteService participanteService;

	@Autowired
	private IHabilidadService habilidadService;

	@Autowired
	private IContactoService contactoService;

	@Autowired
	private IEstudiosService estudiosService;

	@Autowired
	private IExperienciaService experienciaService;

	@GetMapping("/{nombres}")
	public Map<String, Object> listarPorNombre(@PathVariable("nombres") String nombres) throws Exception {

		Participante participante = participanteService.obtenerPorNombre(nombres);

		Map<String, Object> map = new HashMap<>();
		//if (participante.getId() > 0) {

			Integer idParticipante = participante.getId();
			List<Habilidad> habilidades = habilidadService.listarPorIdParticipante(idParticipante);
			List<Contacto> contactos = contactoService.listarPorIdParticipante(idParticipante);
			List<Estudios> estudios = estudiosService.listarPorIdParticipante(idParticipante);
			List<Experiencia> experiencias = experienciaService.listarPorIdParticipante(idParticipante);

			map.put("nombres", participante.getNombre());
			map.put("apellidoMaterno", participante.getApellidoMaterno());
			map.put("apellidoPaterno", participante.getApellidoPaterno());
			map.put("descripcion", participante.getDescripcion());
			map.put("celular", participante.getEmail());
			map.put("email", participante.getEmail());
			map.put("domicilio", participante.getDomicilio());
			map.put("fechaNacimiento", participante.getFechaNacimiento());
			map.put("habilidades", habilidades);
			map.put("contactos", contactos);
			map.put("estudios", estudios);
			map.put("experiencias", experiencias);
		//}
		return map;
	}

}
