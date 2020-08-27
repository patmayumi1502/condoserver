package com.condoserver.moradorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.condoserver.moradorservice.domain.Morador;
import com.condoserver.moradorservice.repository.MoradorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "morador")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MoradorController {

	@Autowired
	MoradorRepository moradorRepository;

	@ApiOperation(value = "Lista um morador especifico")
	@GetMapping(value = "/moradores/{idMorador}")
	public Morador findByidMorador(@PathVariable Integer idMorador) {
		return moradorRepository.findAllByidMorador(idMorador);
	}

	@ApiOperation(value = "Cadastra um novo morador")
	@PostMapping(value = "/moradores")
	public Morador createMorador(@RequestBody Morador morador) {
		
		return moradorRepository.save(morador);
	}	
	
	@ApiOperation(value = "Listagem de Moradores Cadastrados")
	@GetMapping(value = "/moradores")
	public Iterable<Morador> all() {
		return moradorRepository.findAll();
	}
	
}
