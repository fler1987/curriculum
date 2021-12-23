package com.postulacion.avla.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.postulacion.avla.model.Experiencia;

public interface IExperienciaRepo extends IGenericRepo<Experiencia, Integer> {

	@Query(value = "SELECT * FROM experiencia Where id_participante = :idParticipante", nativeQuery = true)
	List<Experiencia> listarPorIdParticipante(@Param("idParticipante") Integer idParticipante);
	
}
