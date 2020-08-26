package com.condoserver.moradorservice.domain;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "CONDOMINIO")
@Entity
public class Condominio implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "IDCONDOMINIO")
	@JsonProperty("idCondominio")
	Integer idCondominio;

	@Column(name = "NOMECONDOMINIO")
	@JsonProperty("nomeCondominio")
	String nomeCondominio;

	@Column(name = "ENDERECOCONDOMINIO")
	@JsonProperty("enderecoCondominio")
	String enderecoCondominio;
	
	@Column(name = "CEP")
	@JsonProperty("cep")
	String cep;

	@Column(name = "CIDADE")
	@JsonProperty("cidade")
	String cidade;

	@Column(name = "ESTADO")
	@JsonProperty("estado")
	String estado;

	public Condominio() {
		super();
	}

	@Override
	public String toString() {
		return "Condominio [idCondominio=" + idCondominio + ", nomeCondominio=" + nomeCondominio
				+ ", enderecoCondominio=" + enderecoCondominio + ", cep=" + cep 
				+ ", cidade=" + cidade + ", estado=" + estado + "]";
	}

	public Condominio(Integer idCondominio, String nomeCondominio, String enderecoCondominio,
			String cep, String cidade, String estado ) {
		super();
		this.idCondominio = idCondominio;
		this.nomeCondominio = nomeCondominio;
		this.enderecoCondominio = enderecoCondominio;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Integer getidCondominio() {
		return idCondominio;
	}

	public void setidCondominio(Integer idCondominio) {
		this.idCondominio = idCondominio;
	}

	public String getnomeCondominio() {
		return nomeCondominio;
	}

	public void setnomeCondominio(String nomeCondominio) {
		this.nomeCondominio = nomeCondominio;
	}

	public String getcep() {
		return cep;
	}

	public void setcep(String cep) {
		this.cep = cep;
	}

	public String getcidade() {
		return cidade;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getestado() {
		return estado;
	}

	public void setestado(String estado) {
		this.estado = estado;
	}

	
}
