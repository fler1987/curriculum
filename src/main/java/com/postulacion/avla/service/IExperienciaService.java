package com.postulacion.avla.service;

import java.util.List;

import com.postulacion.avla.model.Experiencia;

public interface IExperienciaService extends ICRUD<Experiencia, Integer>  {

	List<Experiencia> listarPorIdParticipante(Integer id);
}
