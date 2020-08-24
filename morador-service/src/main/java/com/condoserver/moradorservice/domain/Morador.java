package com.condoserver.moradorservice.domain;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "MORADOR")
@Entity

public class Morador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDMORADOR")
	@JsonProperty("idMorador")
	Integer idMorador;

	@Column(name = "IDCONDOMINIO")
	@JsonProperty("idCondominio")
	Integer idCondominio;

	@Column(name = "EMAIL")
	@JsonProperty("email")
	String email;

	@Column(name = "NOMECLIENTE")
	@JsonProperty("nomeCliente")
	String nomeCliente;

	@Column(name = "DATANASCIMENTO")
	@JsonProperty("dataNascimento")
	Date dataNascimento;

	@Column(name = "ENDERECOCLIENTE")
	@JsonProperty("enderecoCliente")
	String enderecoCliente;

	@Column(name = "TELEFONECONTATO1")
	@JsonProperty("telefoneContato1")
	String telefoneContato1;

	@Column(name = "TELEFONECONTATO2")
	@JsonProperty("telefoneContato2")
	String telefoneContato2;

	@Column(name = "TIMESTAMPCADASTRO")
	@JsonProperty("timestampCadastro")
	Timestamp timestampCadastro;

	@Column(name = "CODIGOCOMPROVANTEEND")
	@JsonProperty("codigoComprovanteEnd")
	Integer codigoComprovanteEnd;

	@Column(name = "IDSTATUS")
	@JsonProperty("idStatus")
	String idStatus;

	public Morador() {
		super();
	}

	@Override
	public String toString() {
		return "Morador [idMorador=" + idMorador + ", idCondominio=" + idCondominio
				+ ", email=" + email + ", nomeCliente=" + nomeCliente + ", dataNascimento="
				+ dataNascimento + ", enderecoCliente=" + enderecoCliente + ", telefoneContato1=" 
				+ telefoneContato1 + ", telefoneContato2=" + telefoneContato2 + ", timestampCadastro="
				+ timestampCadastro + ", codigoComprovanteEnd=" + codigoComprovanteEnd + ", idStatus="
				+ idStatus + "]";
	}

	public Morador(Integer idMorador, Integer idCondominio, String email, String nomeCliente, Date dataNascimento,
			String enderecoCliente, String telefoneContato1, String telefoneContato2, Timestamp timestampCadastro,
			Integer codigoComprovanteEnd, String idStatus) {
		super();
		this.idMorador = idMorador;
		this.idCondominio = idCondominio;
		this.email = email;
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.enderecoCliente = enderecoCliente;
		this.telefoneContato1 = telefoneContato1;
		this.telefoneContato2 = telefoneContato2;
		this.timestampCadastro = timestampCadastro;
		this.codigoComprovanteEnd = codigoComprovanteEnd;
		this.idStatus = idStatus;
		
	}

	public Integer getidMorador() {
		return idMorador;
	}

	public void setidMorador(Integer idMorador) {
		this.idMorador = idMorador;
	}

	public Integer getidCondominio() {
		return idCondominio;
	}

	public void setidCondominio(Integer idCondominio) {
		this.idCondominio = idCondominio;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getnomeCliente() {
		return nomeCliente;
	}

	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getdataNascimento() {
		return dataNascimento;
	}

	public void setdataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getenderecoCliente() {
		return enderecoCliente;
	}

	public void setenderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String gettelefoneContato1() {
		return telefoneContato1;
	}

	public void settelefoneContato1(String telefoneContato1) {
		this.telefoneContato1 = telefoneContato1;
	}

	public String gettelefoneContato2() {
		return telefoneContato2;
	}

	public void settelefoneContato2(String telefoneContato2) {
		this.telefoneContato2 = telefoneContato2;
	}

	public Timestamp gettimestampCadastro() {
		return timestampCadastro;
	}

	public void settimestampCadastro(Timestamp timestampCadastro) {
		this.timestampCadastro = timestampCadastro;
	}

	public Integer getcodigoComprovanteEnd() {
		return codigoComprovanteEnd;
	}

	public void setcodigoComprovanteEnd(Integer codigoComprovanteEnd) {
		this.codigoComprovanteEnd = codigoComprovanteEnd;
	}

	public String getidStatus() {
		return idStatus;
	}

	public void setidStatus(String idStatus) {
		this.idStatus = idStatus;
	}

	
}
