package com.postulacion.avla.service;

import java.util.List;

import com.postulacion.avla.model.Contacto;

public interface IContactoService extends ICRUD<Contacto, Integer>  {

	List<Contacto> listarPorIdParticipante(Integer id);
}
