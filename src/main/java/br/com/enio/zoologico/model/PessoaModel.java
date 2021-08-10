package br.com.enio.zoologico.model;

import java.time.LocalDate;

public class PessoaModel {
	private String nome;
	private LocalDate nasc;
	public String getNome() {
		return nome;
	}
	public LocalDate getNasc() {
		return nasc;
	}
	public PessoaModel() {
		this.nome=nome;
		this.nasc=nasc;

	}
}
