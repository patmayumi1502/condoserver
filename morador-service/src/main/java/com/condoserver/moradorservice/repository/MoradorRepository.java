package com.condoserver.moradorservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.condoserver.moradorservice.domain.Morador;

public interface MoradorRepository extends CrudRepository<Morador, Integer> {
	
	Morador findAllByidMorador(Integer idMorador);

	Morador save(Morador morador);

}
