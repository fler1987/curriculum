package com.postulacion.avla.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postulacion.avla.model.Estudios;
import com.postulacion.avla.repo.IEstudiosRepo;
import com.postulacion.avla.repo.IGenericRepo;
import com.postulacion.avla.service.IEstudiosService;

@Service
public class EstudiosServiceImpl extends CRUDImpl<Estudios, Integer> implements IEstudiosService {

	@Autowired
	private IEstudiosRepo repo;

	@Override
	protected IGenericRepo<Estudios, Integer> getRepo() {
		return repo;
	}
	
	@Override
	public List<Estudios> listarPorIdParticipante(Integer id){
		return repo.listarPorIdParticipante(id);
	}
}
