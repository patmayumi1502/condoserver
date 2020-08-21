package com.condoserver.produtoservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "PRODUTOS")
@Entity

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODIGOPRODUTO")
	@JsonProperty("codigoProduto")
	Integer codigoProduto;

	@Column(name = "DESCRICAOPRODUTO")
	@JsonProperty("descricaoProduto")
	String descricaoProduto;

	@Column(name = "DETALHEPRODUTO")
	@JsonProperty("detalheProduto")
	String detalheProduto;

	@Column(name = "MARCAPRODUTO")
	@JsonProperty("marcaProduto")
	String marcaProduto;

	@Column(name = "VALORPRODUTO")
	@JsonProperty("valorProduto")
	double valorProduto;

	public Produto() {
		super();
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", descricaoProduto=" + descricaoProduto
				+ ", detalheProduto=" + detalheProduto + ", marcaProduto=" + marcaProduto + ", valorProduto="
				+ valorProduto + "]";
	}

	public Produto(Integer codigoProduto, String descricaoProduto, String detalheProduto, String marcaProduto,
			double valorProduto) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.detalheProduto = detalheProduto;
		this.marcaProduto = marcaProduto;
		this.valorProduto = valorProduto;
	}

	public Integer getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getDetalheProduto() {
		return detalheProduto;
	}

	public void setDetalheProduto(String detalheProduto) {
		this.detalheProduto = detalheProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

}
