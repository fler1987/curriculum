package com.postulacion.avla.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postulacion.avla.model.Participante;
import com.postulacion.avla.repo.IGenericRepo;
import com.postulacion.avla.repo.IParticipanteRepo;
import com.postulacion.avla.service.IParticipanteService;

@Service
public class ParticipanteServiceImpl extends CRUDImpl<Participante, Integer> implements IParticipanteService {

	@Autowired
	private IParticipanteRepo repo;

	@Override
	protected IGenericRepo<Participante, Integer> getRepo() {
		return repo;
	}
}
