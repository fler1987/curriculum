package com.postulacion.avla.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postulacion.avla.model.Experiencia;
import com.postulacion.avla.repo.IExperienciaRepo;
import com.postulacion.avla.repo.IGenericRepo;
import com.postulacion.avla.service.IExperienciaService;

@Service
public class ExperienciaServiceImpl extends CRUDImpl<Experiencia, Integer> implements IExperienciaService {

	@Autowired
	private IExperienciaRepo repo;

	@Override
	protected IGenericRepo<Experiencia, Integer> getRepo() {
		return repo;
	}
	
	@Override
	public List<Experiencia> listarPorIdParticipante(Integer id){
		return repo.listarPorIdParticipante(id);
	}

}
