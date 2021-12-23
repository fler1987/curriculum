package com.postulacion.avla.service;

import java.util.List;

import com.postulacion.avla.model.Estudios;


public interface IEstudiosService extends ICRUD<Estudios, Integer>  {

	List<Estudios> listarPorIdParticipante(Integer id);
}
