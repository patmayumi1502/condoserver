package com.condoserver.produtoservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.condoserver.produtoservice.domain.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	Produto findAllByCodigoProduto(Integer codigoProduto);

	Produto save(Produto produto);

}
