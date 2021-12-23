package com.postulacion.avla.service;

import java.util.List;

import com.postulacion.avla.model.Habilidad;

public interface IHabilidadService extends ICRUD<Habilidad, Integer> {

	List<Habilidad> listarPorIdParticipante(Integer id);
}
