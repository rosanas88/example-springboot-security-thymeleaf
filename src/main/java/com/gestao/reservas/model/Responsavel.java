package com.gestao.reservas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Responsavel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nome_responsavel")
	private String nome;
	
	@Column(name = "documento_responsavel")
	private String documento;
	
	@Column(name = "telefone_responsavel")
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
