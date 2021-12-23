package com.postulacion.avla.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ParticipanteResponse   {

	private Participante participante;
	private List<Habilidad> habilidades;
	private List<Contacto> contactos;
	private List<Estudios> estudios;
	private List<Experiencia> experiencias;
	
	
	
	public ParticipanteResponse(Participante participante, List<Habilidad> habilidades, List<Contacto> contactos,
			List<Estudios> estudios, List<Experiencia> experiencias) {
		super();
		this.participante = participante;
		this.habilidades = habilidades;
		this.contactos = contactos;
		this.estudios = estudios;
		this.experiencias = experiencias;
	}
	


	public Map<String, Object> toMap(){
		Map<String, Object> map = new HashMap<>();
		map.put("habilidades", this.habilidades);
		map.put("contactos", this.contactos);
		map.put("estudios", this.estudios);
		map.put("experiencias", this.experiencias);		
		return map;
	}
	
	
	public Participante getParticipante() {
		return participante;
	}



	public void setParticipante(Participante participante) {
		this.participante = participante;
	}



	public List<Habilidad> getHabilidades() {
		return habilidades;
	}



	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}



	public List<Contacto> getContactos() {
		return contactos;
	}



	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}



	public List<Estudios> getEstudios() {
		return estudios;
	}



	public void setEstudios(List<Estudios> estudios) {
		this.estudios = estudios;
	}



	public List<Experiencia> getExperiencias() {
		return experiencias;
	}



	public void setExperiencias(List<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}



	
}
