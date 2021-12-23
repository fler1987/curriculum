package com.postulacion.avla.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.postulacion.avla.model.Habilidad;

public interface IHabilidadRepo extends IGenericRepo<Habilidad, Integer> {

	@Query(value = "SELECT * FROM habilidad Where id_participante = :idParticipante", nativeQuery = true)
	List<Habilidad> listarPorIdParticipante(@Param("idParticipante") Integer idParticipante);
	
}
