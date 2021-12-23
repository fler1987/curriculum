package com.postulacion.avla.repo;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.postulacion.avla.model.Estudios;

public interface IEstudiosRepo extends IGenericRepo<Estudios, Integer> {
	
	@Query(value = "SELECT * FROM estudios Where id_participante = :idParticipante", nativeQuery = true)
	List<Estudios> listarPorIdParticipante(@Param("idParticipante") Integer idParticipante);
	
}
