package com.postulacion.avla.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postulacion.avla.model.Contacto;
import com.postulacion.avla.repo.IContactoRepo;
import com.postulacion.avla.repo.IGenericRepo;
import com.postulacion.avla.service.IContactoService;

@Service
public class ContactoServiceImpl extends CRUDImpl<Contacto, Integer> implements IContactoService {

	@Autowired
	private IContactoRepo repo;

	@Override
	protected IGenericRepo<Contacto, Integer> getRepo() {
		return repo;
	}

}
