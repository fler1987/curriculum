package com.postulacion.avla.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.postulacion.avla.model.Contacto;

public interface IContactoRepo extends IGenericRepo<Contacto, Integer> {

	@Query(value = "SELECT * FROM contacto Where id_participante = :idParticipante", nativeQuery = true)
	List<Contacto> listarPorIdParticipante(@Param("idParticipante") Integer idParticipante);
}
