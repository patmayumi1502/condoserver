package com.condoserver.produtoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.condoserver.produtoservice.domain.Produto;
import com.condoserver.produtoservice.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "produto")
@CrossOrigin

public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;

	@ApiOperation(value = "Listagem de Produtos Cadastrados")
	@GetMapping(value = "/produtos")
	public Iterable<Produto> all() {
		return produtoRepository.findAll();
	}

	@ApiOperation(value = "Lista um produto especifico")
	@GetMapping(value = "/produtos/{produtoId}")
	public Produto findByCodigoProduto(@PathVariable Integer produtoId) {
		return produtoRepository.findAllByCodigoProduto(produtoId);
	}

	@ApiOperation(value = "Cadastra um novo produto")
	@PostMapping(value = "/produtos")
	public Produto createProduto(@RequestBody Produto produto) {
		
		return produtoRepository.save(produto);
	}
	
}
