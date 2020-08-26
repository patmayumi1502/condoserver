package com.condoserver.moradorservice.controller;

import java.net.URI;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.condoserver.moradorservice.domain.Morador;
import com.condoserver.moradorservice.repository.MoradorRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "morador")

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
	
}
