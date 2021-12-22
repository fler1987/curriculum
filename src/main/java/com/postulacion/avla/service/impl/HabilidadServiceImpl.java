package com.postulacion.avla.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postulacion.avla.model.Habilidad;
import com.postulacion.avla.repo.IGenericRepo;
import com.postulacion.avla.repo.IHabilidadRepo;
import com.postulacion.avla.service.IHabilidadService;

@Service
public class HabilidadServiceImpl extends CRUDImpl<Habilidad, Integer> implements IHabilidadService {

	@Autowired
	private IHabilidadRepo repo;

	@Override
	protected IGenericRepo<Habilidad, Integer> getRepo() {
		return repo;
	}

}
