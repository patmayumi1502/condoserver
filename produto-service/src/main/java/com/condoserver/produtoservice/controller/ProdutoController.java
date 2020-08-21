package com.condoserver.produtoservice.controller;

import java.net.URI;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.condoserver.produtoservice.domain.Produto;
import com.condoserver.produtoservice.repository.ProdutoRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "produto")

public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;

	@ApiOperation(value = "Listagem de Produtos Cadastrados")
	@GetMapping(value = "/produto")
	public Iterable<Produto> all() {
		return produtoRepository.findAll();
	}

	@ApiOperation(value = "Lista um produto especifico")
	@GetMapping(value = "/produto/{produtoId}")
	public Produto findByCodigoProduto(@PathVariable Integer produtoId) {
		return produtoRepository.findAllByCodigoProduto(produtoId);
	}

	@ApiOperation(value = "Cadastra um novo produto")
	@PostMapping(value = "/produto")
	public Produto createProduto(@RequestBody Produto produto) {
		
		return produtoRepository.save(produto);
	}

}
