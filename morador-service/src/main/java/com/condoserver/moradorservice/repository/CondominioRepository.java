package com.condoserver.moradorservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.condoserver.moradorservice.domain.Condominio;

public interface CondominioRepository  extends CrudRepository<Condominio, Integer> {

	Condominio findAllByidCondominio (Integer idCondominio);

	Condominio save(Condominio condominio);

}
