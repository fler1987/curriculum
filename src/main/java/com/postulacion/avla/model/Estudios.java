package com.postulacion.avla.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estudios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_participante", nullable = false, foreignKey = @ForeignKey(name="FK_estudios_participante"))
	private Participante participante;
	
	@Column(name="titulo_obtenido", length=250, nullable=false)
	private String tituloObtenido;
	
	@Column(name="institucion", length=200, nullable=false)
	private String institucion;
	
	@Column(name="duracion", length=200, nullable=true)
	private LocalDateTime duracion;
	
	@Column(name="estado", length=100, nullable=true)
	private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
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

	public LocalDateTime getDuracion() {
		return duracion;
	}

	public void setDuracion(LocalDateTime duracion) {
		this.duracion = duracion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}		

	
}
