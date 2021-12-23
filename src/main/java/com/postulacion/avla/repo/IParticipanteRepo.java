package com.postulacion.avla.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.postulacion.avla.model.Participante;

public interface IParticipanteRepo extends IGenericRepo<Participante, Integer> {

	@Query(value = "SELECT * FROM participante Where LOWER(nombre) like Lower('%:nombres%') limit 1", nativeQuery = true)
	Participante obtenerPorNombre(@Param("nombres") String nombres);
	
}
