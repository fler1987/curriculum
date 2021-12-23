package com.postulacion.avla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="id_participante", nullable=false)
	private Integer idParticipante;
	
	@Column(name="titulo_obtenido", length=250, nullable=false)
	private String tituloObtenido;
	
	@Column(name="institucion", length=200, nullable=false)
	private String institucion;
	
	@Column(name="duracion", length=200, nullable=true)
	private String duracion;
	
	@Column(name="estado", length=100, nullable=true)
	private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(Integer participante) {
		this.idParticipante = participante;
	}

	public String getTituloObtenido() {
		return tituloObtenido;
	}

	public void setTituloObtenido(String tituloObtenido) {
		this.tituloObtenido = tituloObtenido;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}		

	
}
