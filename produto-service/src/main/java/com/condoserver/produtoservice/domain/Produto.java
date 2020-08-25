package com.condoserver.produtoservice.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name = "PRODUTOS")
@Entity

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGOPRODUTO")
	Integer codigoProduto;

	@Column(name = "DESCRICAOPRODUTO")
	String descricaoProduto;

	@Column(name = "DETALHEPRODUTO")
	String detalheProduto;

	@Column(name = "MARCAPRODUTO")
	String marcaProduto;

	@Column(name = "VALORPRODUTO")
	double valorProduto;
	
	@Column(name = "CAMINHOFOTO")
	String caminhoFoto;
	
	@Column(name = "IDMORADOR")
	Integer idMorador;
	
	public Produto() {
		super();
	}

	@Override
	public String toString() {
		return "Produto [codigoProduto=" + codigoProduto + ", descricaoProduto=" + descricaoProduto
				+ ", detalheProduto=" + detalheProduto + ", marcaProduto=" + marcaProduto + ", valorProduto="
				+ valorProduto + ", caminhoFoto=" + caminhoFoto + ", idMorador=" + idMorador + "]";
	}

	public Produto(Integer codigoProduto, String descricaoProduto, String detalheProduto, String marcaProduto,
			double valorProduto, String caminhoFoto, Integer idMorador ) {
		super();
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.detalheProduto = detalheProduto;
		this.marcaProduto = marcaProduto;
		this.valorProduto = valorProduto;
		this.caminhoFoto = caminhoFoto;
		this.idMorador = idMorador;
		

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

	public String getCaminhoFoto() {
		return caminhoFoto;
	}

	public void setCaminhoFoto(String caminhoFoto) {
		this.caminhoFoto = caminhoFoto;
	}

	public Integer getIdMorador() {
		return idMorador;
	}

	public void setIdMorador(Integer idMorador) {
		this.idMorador = idMorador;
	}

}
